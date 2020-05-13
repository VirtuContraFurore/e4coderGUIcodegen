import PIL
from PIL import Image
import numpy as np

path = raw_input("inserisci il percorso dell'immagine (digitate exit per uscire): ")
while path != "exit":
    width = input("inserire la larghezza in px finale dell'immagine: ")
    height = input("inserire l'altezza in px finale dell'immagine: ")

    name = path.split("/")[-1].split(".")[0]

    # apro l'immagine
    img = Image.open(path)

    # la ridimensiono
    img = img.resize(size = (width, height), resample = PIL.Image.BICUBIC)

    # trasformo in un array numpy
    arr = np.array(img)

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
        for i in range(len(arr)):
            for j in range(len(arr[i])):

                # estraggo i colori e riduco la dimensione
                r = arr[i][j][0] >> 3
                g = arr[i][j][1] >> 2
                b = arr[i][j][2] >> 3

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

        f.write("struct Bitmap bitmap_" + name + " = {\n")
        f.write("\t.width = " + str(width) + ",\n")
        f.write("\t.height = " + str(height) + ",\n")
        f.write("\t.bmp = bmp_data_" + name + ",\n")
        f.write("};\n\n")

        f.write("#endif")

        path = raw_input("inserisci il percorso dell'immagine (digitate exit per uscire): ")
