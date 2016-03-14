package introduccion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerConCharset {

	public static void main(String[] args) {
		//definimos
		try(Scanner in = new Scanner(new File("datosEntrada/Fichero2"),"ISO-8859-1");) {
			while(in.hasNext()){
				String palabra = in.next();
				String patron = "Palabra leida %s\n";
				String resultado = String.format(patron, palabra);
				System.out.print(resultado);
				//lo anterior es equivalente a printf
			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
