package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ejemplo1NIO {

	public static void main(String[] args) {
		Path inPath = Paths.get("ficheros/nuevo.txt");
		System.out.println("Fichero: "+inPath.toString());
		System.out.println("Raiz del fichero: "+inPath.getRoot());
		System.out.println("Directorio contenedor: "+inPath.getParent());
		System.out.println("Numero de elementos en el Path: "+inPath.getNameCount());
		
		//indicamos los elementos en el Path
		for (int i = 0; i < inPath.getNameCount(); i++) {
			System.out.println("Nivel "+i+" "+inPath.getName(i));
		}
		//copaimos el fichero a otro nuevo
		Path outPath = Paths.get("ficheros/nuevoCopiado.txt");
		try {
			Files.copy(inPath, outPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
