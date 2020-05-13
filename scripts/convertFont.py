import PIL
from PIL import Image
from PIL import ImageDraw
from PIL import ImageFont
import numpy as np
import math
import sys

if len(sys.argv) == 1:
    print "necessario inserire i path dei file di ingresso (.ttf)"

fonts_size = [12, 24, 48] # la grandezza in pixel dei font che verranno generati

img = Image.new('RGB', (500, 500))
d = ImageDraw.Draw(img)

# per ogni file in igresso del programma
for param in range(1, len(sys.argv)):

    # per ogni grandezza specificata genero un file .h con nome: [nome_font] + [grandezza_font] + .h
    for size in fonts_size:

        path = sys.argv[param]
        name = path.split("/")[-1].split(".")[0] + str(size);

        with open(name + '.h', 'a') as f:

            #cancello il contenuto se esisteva gia un file con lo stesso nome
            f.seek(0)
            f.truncate()

            name = name + "px"

            #inserisco l'include per il font
            f.write("#ifndef " + name.upper() + "_FONT_H\n#define " + name.upper() + "_FONT_H\n\n")
            f.write('#include "windowmanager/graphics/font.h"\n');

            font = ImageFont.truetype(path, size) # carico il font

            char_names = [] # lista che conterra il nome dei vari caratteri

            for i in range(33, 127):
                c = chr(i)
                ch_name = "c" + str(i) + "_" + name # nome del carattere
                char_names.append(ch_name)

                # cancello e ridisegno l'immagine con il carattere successivo
                d.rectangle((0, 0, 100, 2 * size), fill=(0, 0, 0, 0))
                d.text((0, 0), c, fill=(255, 255, 255), font = font)

                #trasformo l'immagine in un array numpy
                arr = np.array(img)
                w, h = d.textsize(c, font = font)
                byte = 0

                #scrivo la dichiarazione dell'array che conterra i dati della lettera
                #l'array e' un array di caratteri in cui ogni bit del carattere indica
                #se il punto va colorato
                f.write("const unsigned char " + ch_name + "_data[" + str(int(math.floor((h * w) / 8 + 1))) + "] = {\n\t")

                #leggo l'array numpy e guardo dove e' scritto e dove non lo e'
                for y in range(h):
                    for x in range(w):

                        #estrazione dei colori
                        r = arr[y][x][0];
                        g = arr[y][x][1];
                        b = arr[y][x][2];

                        # inserisco un nuovo bit
                        byte = (byte << 1)
                        if r != 0 and g != 0 and b != 0:
                            byte = byte + 1

                        #scrivo il byte sul file
                        if (y * w + x + 1) % 8 == 0:
                            f.write("0x{:02x}, ".format(byte))
                            byte = 0

                        # ogni 8 byte vado a capo
                        if (y * w + x + 1) % 64 == 0:
                            f.write("\n\t")

                f.write("0x{:02x}\n".format(byte << (8 - ((h * w) % 8))))
                f.write("};\n")

                # finito di scrivere l'array inizializzo una struttura carattere per il carattere corrente
                f.write("const struct Character " + ch_name + " = {.data = " + ch_name + "_data, .width = " + str(w) + ", .height = " + str(h) + "};\n")

            # inizializzo un array contenente tutti i caratteri generati
            f.write("const struct Character " + name + "_alphabet[94] = {\n")
            for i in char_names:
                f.write("\t" + i + ",\n")
            f.write("};\n")

            # finalemnte posso inizializzare il font
            f.write("struct Font font_" + name + " = {\n")
            f.write("\t.symbols = " + name + "_alphabet,\n")
            f.write("\t.size = " + str(size) + ",\n")
            f.write("};\n\n")

            f.write("#endif")
