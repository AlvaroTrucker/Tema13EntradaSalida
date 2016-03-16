package ejercicios;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio1 {

	public static void main(String[] args) {
		try (FileOutputStream FileOut = new FileOutputStream("salidaEjercicios/ejercicioFileOutputStream.txt");){
			for (int i = 250; i <=260; i++) {
				FileOut.write(i);
				FileOut.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (DataOutputStream DataOut = new DataOutputStream(new FileOutputStream("salidaEjercicios/ejercicioDataOutputStream.txt"));){
			for (int i = 20; i <=40; i++) {
				DataOut.writeInt(i);
				DataOut.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
