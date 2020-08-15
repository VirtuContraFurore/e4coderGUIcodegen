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
}
