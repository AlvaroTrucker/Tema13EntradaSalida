package introduccion;

import java.io.File;
import java.util.Scanner;

public class ListadoRecursivoDirectorio {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce la ruta absoluta del directorio");
		String dir = in.next();
		
		//creamos el descriptor al posible directorio
		File inFile = new File(dir);
		if(inFile.exists()){
			if(inFile.isFile())
				System.out.println(inFile+" no es un directorio");
			else listarFicheros(inFile);
		}
		else System.out.println(inFile+" no existe");

	}

	//va a tener recursividad, en el caso de que aparezca
	//un nuevo directorio volvemos a llamar al metodo
	public static void listarFicheros(File directorio){
		System.out.println("DIRECTORIO: "+directorio);
		//obtenemos el listado de los ficheros que contiene
		File[] listaArchivos = directorio.listFiles();
		for (File file : listaArchivos) {
			if(file.isFile())
				System.out.println(file);
			else listarFicheros(file);
		}
	}
}
