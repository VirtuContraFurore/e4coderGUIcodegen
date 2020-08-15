package it.sssuprojects.e4codergui.codegen.services;

import java.io.File;

import it.sssuprojects.e4codergui.Path;

public class ImageConversion {
	
	public static void Prova(Path path) {
		System.out.println("eseguo");
		System.out.println(path);
		System.out.println(path.eIsProxy());
		System.out.println(path.getPath());
		File f = new File(path.getPath());
		System.out.println(f.exists());
	}
	
	//colore rgb 565
	public static String getBitmap() {
		return "0xFF";
	}
	
	//1->presente 0->assente
	public static String getAlpha() {
		return "0x00";
	}
	
	public static int getWidth() {
		return 0;
	}
	
	public static int getHeight() {
		return 0;
	}
	
	
}
