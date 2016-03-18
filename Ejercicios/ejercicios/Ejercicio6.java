package ejercicios;

import java.io.File;

public class Ejercicio6 {

	public static void main(String[] args) {
		//controlamos que haya dos argumentos
		if(args.length != 2 & !args[1].matches("\\d+") && Integer.parseInt(args[1]) != 0){
			System.out.println("Error en argumentos");
			System.exit(1);
		}
		File inFile = new File("datosEntrada/"+args[0]);
		for (int i = 0; i < Integer.parseInt(args[1]); i++) {
			String nombreFicheroSalida="salidaEjercicios/trozo"+i+".txt";
		}
		//long tamanoTrozos = inFile.length()/Integer.parseInt(s)
	}

}
