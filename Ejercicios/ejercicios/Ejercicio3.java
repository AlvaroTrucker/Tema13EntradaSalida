package ejercicios;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejercicio3 {

	public static void main(String[] args) {
		try(PrintWriter PrintWriter = new PrintWriter("salidaEjercicios/EjercicioFileWriter.txt");) {
			for (int i = 250; i <= 260; i++) {
				PrintWriter.write(i);
				PrintWriter.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(FileReader FileReader = new FileReader("salidaEjercicios/EjercicioFileWriter.txt");) {
			int numeros;
			while((numeros=FileReader.read())!=-1){
				System.out.println((int)numeros);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
