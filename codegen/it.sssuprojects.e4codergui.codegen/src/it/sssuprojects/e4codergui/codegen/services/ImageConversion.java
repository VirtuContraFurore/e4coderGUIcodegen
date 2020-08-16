package it.sssuprojects.e4codergui.codegen.services;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import it.sssuprojects.e4codergui.Path;

public class ImageConversion {
	
	public static void Prova(Path path) {
		try {
			BufferedImage img = ImageIO.read(new File(path.getPath()));
			
			System.out.println("Has alpha: "+(img.getAlphaRaster() != null));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//colore rgb 565
	public static String getBitmap(Path path) {
		try {
			BufferedImage img = ImageIO.read(new File(path.getPath()));
			
			boolean hasAlpha = img.getAlphaRaster() != null;
			final byte[] pixels = ((DataBufferByte) img.getRaster().getDataBuffer()).getData();
			
			int bytePerPixel = (hasAlpha) ? 4 : 3;
			int size = (int) Math.ceil(pixels.length / (bytePerPixel));
			
			String result = "["+size+"] = {\n\t";
			
			int row = 0;
			int max_row = 10;
			
			for(int i = 0; i<pixels.length;) {
				++row;
				byte r,g,b;
				if(hasAlpha) {
					++i; //eat apha
					b=pixels[i];
					++i; //eat blue
					g=pixels[i];
					++i; //eat green
					r=pixels[i];
					++i; //eat red
				} else {
					b=pixels[i];
					++i; //eat blue
					g=pixels[i];
					++i; //eat green
					r=pixels[i];
					++i; //eat red
				}
				int pix_565 = (r&0xF8)<<(11-3) | (g&0xFC)<<(5-2) | (b&0xF8)>>3;
				result+=String.format("0x%04X", pix_565)+", ";
				if(row>max_row) {
					row=0;
					result+="\n\t";
				}
			}
			result=result.substring(0, result.length()-2);
			result+="\n}";
			return result;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "ERROR WRITING IMAGE BITMAP";
	}
	
	//1->presente 0->assente
	public static String getAlpha(Path path) {
		try {
			BufferedImage img = ImageIO.read(new File(path.getPath()));
			
			boolean hasAlpha = img.getAlphaRaster() != null;
			final byte[] pixels = ((DataBufferByte) img.getRaster().getDataBuffer()).getData();
			
			int bytePerPixel = (hasAlpha) ? 4 : 3;
			int size = (int) Math.ceil(pixels.length / (bytePerPixel * 8));
			
			String result = "["+size+"] = {\n\t";
			
			int cnt = 0;
			byte data = 0;
			
			int row = 0;
			int max_row = 15;
			
			for(int i = 0; i<pixels.length;) {
				boolean pix = false;
				if(hasAlpha) {
					if(((int)(pixels[i]&0xFF)) > 25) { /* random chosen threshold! */
						pix = true;
					} else {
						pix = false;
					}
					i+=4;
				} else {
					i+=3;
					pix = true;
				}
				data |= (pix) ? 1 : 0;
				++cnt;
				if(cnt < 8) {
					data <<= 1;
				} else {
					++row;
					result+=String.format("0x%02X", data)+", ";
					cnt = 0;
					data = 0;
					if(row>max_row) {
						row=0;
						result+="\n\t";
					}
				}
			}
			if(cnt > 0) {
				data <<= 7-cnt;
				result+=String.format("0x%02X", data)+", ";
			}
			result=result.substring(0, result.length()-2);
			result+="\n}";
			return result;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "ERROR WRITING IMAGE ALPHA";
	}
	
	public static int getWidth(Path path) {
		try {
			BufferedImage img = ImageIO.read(new File(path.getPath()));
			return img.getWidth();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
	
	public static int getHeight(Path path) {
		if(path.getPath() == null) {
			System.out.println("path is null");
			System.out.println(path.getValue());
			System.out.println(path.eIsProxy());
			return 0;
		}
		
		try {
			BufferedImage img = ImageIO.read(new File(path.getPath()));
			return img.getHeight();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
	
	
	
}
