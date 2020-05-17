#ifndef BITMAP_H
#define BITMAP_H

struct Bitmap {
    const unsigned short* bmp;
    const unsigned char* alpha;
    int width;
    int height;
};

#endif
