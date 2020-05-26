import PIL
from PIL import Image
import numpy as np
import math

path = raw_input("inserisci il percorso dell'immagine (digitate exit per uscire): ")
while path != "exit":
    width = input("inserire la larghezza in px finale dell'immagine: ")
    height = input("inserire l'altezza in px finale dell'immagine: ")

    name = path.split("/")[-1].split(".")[0]

    # apro l'immagine
    img = Image.open(path)
    img = img.convert('RGBA')
    # la ridimensiono
    img = img.resize(size = (width, height), resample = PIL.Image.BICUBIC)

    # trasformo in un array numpy
    arr = np.array(img)

    alpha_bitmask = np.zeros(int(math.ceil(width * height / 8)));

    with open(name + ".h", 'a') as f:
        #cancello il file se esiste gia'
        f.seek(0)
        f.truncate()

        #define per richiami multipli
        f.write("#ifndef " + name.upper() + "_BITMAP_H\n#define " + name.upper() + "_BITMAP_H\n\n")

        #include
        f.write('#include "windowmanager/graphics/bitmap.h"\n\n')
        f.write("const unsigned short bmp_data_" + name + "[" + str(width * height) + "] = {\n\t");

        #per ogni pixel dell'immagine
        counter = 0
        for i in range(len(arr)):
            for j in range(len(arr[i])):

                # estraggo i colori e riduco la dimensione
                r = arr[i][j][0] >> 3
                g = arr[i][j][1] >> 2
                b = arr[i][j][2] >> 3

                a = arr[i][j][3];
                if a == 0:
                    a = 0
                else:
                    a = (1 << (7 - (counter % 8)))

                alpha_index = int(counter / 8)
                pre_value = int(alpha_bitmask[alpha_index])
                alpha_bitmask[alpha_index] = pre_value + a
                counter = counter + 1

                # converto in uno short rgb 565
                short = (r << 11) + (g << 5) + b;

                # scrivo i due byte
                if j != len(arr[i]) - 1 or i != len(arr) - 1:
                    f.write("0x{:04x}, ".format(short))
                else:
                    f.write("0x{:04x}".format(short))

                if i + j > 0 and (i * len(arr[i]) + j + 1) % 9 == 0:
                    f.write("\n\t")

        f.write("\n};\n\n")

        f.write("const unsigned char bitmask_data_" + name + "[" + str(int(math.ceil(width * height / 8))) + "] = {\n\t")
        for i in range(len(alpha_bitmask)):
            f.write("0x{:02x}, ".format(int(alpha_bitmask[i])))
            if (i + 1) % 16 == 0:
                f.write("\n\t")
        f.write("\n};\n\n")

        f.write("struct Bitmap bitmap_" + name + " = {\n")
        f.write("\t.width = " + str(width) + ",\n")
        f.write("\t.height = " + str(height) + ",\n")
        f.write("\t.bmp = bmp_data_" + name + ",\n")
        f.write("\t.alpha = bitmask_data_" + name + ",\n")
        f.write("};\n\n")

        f.write("#endif")

        path = raw_input("inserisci il percorso dell'immagine (digitate exit per uscire): ")
