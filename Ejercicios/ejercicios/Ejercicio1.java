package ejercicios;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio1 {

	public static void main(String[] args) {
		File outFile = new File("salidaEjercicios/ejercicioFileOutputStream.txt");
		try(FileOutputStream out = new FileOutputStream(outFile);) {
			for (int i = 20; i <= 40; i++) {
				out.write(i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
