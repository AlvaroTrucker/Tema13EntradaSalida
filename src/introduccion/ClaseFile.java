package introduccion;

import java.io.File;
import java.io.IOException;

public class ClaseFile {

	public static void main(String[] args) {
		//creamos el descriptor al fichero
		File inFile1 = new File("ficheros/prueba1.txt");
		
		//accediendo a propiedades del archivo
		System.out.println("Existe el fichero? "+inFile1.exists());
		System.out.println("Ruta absoluta "+inFile1.getAbsolutePath());
		System.out.println("Tamaño "+inFile1.length());
		System.out.println("Es de lectura? "+inFile1.canRead());
		System.out.println("Es de escritura "+inFile1.canWrite());
		System.out.println("Es un archivo regular? "+inFile1.isFile());
		
		//creacion de un nuevo fichero
		File inFile2 = new File("ficheros/nuevo.txt");
		try {
			inFile2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//accediendo a un directorio
		File inFile3 = new File("ficheros");
		if(inFile3.isDirectory()){
			System.out.println(inFile3+" es un directorio");
			String[] archivosContenidos = inFile3.list();
			System.out.println("Numero de archivos: "+archivosContenidos.length);
			for (String stringArchivos : archivosContenidos) {
				System.out.println(stringArchivos);
			}
		}
		
	}

}
