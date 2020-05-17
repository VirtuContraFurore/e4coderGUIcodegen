convertFont.py:
  input:
    come parametro del programma i path a file .ttf che si vogliono convertire
  output:
    per ogni file .ttf caricato genera 3 file .h con all'interno la definizione
    di una variabile [struct Font] di nome font_[nome font][grandezza font]px
    con [grandezza font] 12, 24, 48 pixel (modificabile nello script) e nome font
    estratto dal nome del file .ttf

to_RGB565.py:
  input:
    descritto all'avvio del programma
  output:
    un file .h con all'interno una variabile di tipo [struct Bitmap]di nome
    bitmap_[nome immagine] in cui [nome immagine] è estratto dal nome del file
    che viene caricato
