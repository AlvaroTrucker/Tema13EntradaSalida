package ejercicios;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ejercicio2 {

	public static void main(String[] args) {
		try (FileInputStream FileIn = new FileInputStream("salidaEjercicios/ejercicioFileOutputStream.txt");){
			int numeros;
			while((numeros=FileIn.read())!=-1){
				System.out.println((int)numeros);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (DataInputStream DataIn = new DataInputStream(new FileInputStream("salidaEjercicios/ejercicioDataOutputStream.txt"));){
			while (DataIn.available()!=0){
				int numeros = DataIn.readInt();
				System.out.println(numeros);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
