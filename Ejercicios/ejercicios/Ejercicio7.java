package ejercicios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio7 {

	public static void main(String[] args) {
		File inFile1 = new File("salidaEjercicios/trozos1.txt");
		File inFile2 = new File("salidaEjercicios/trozos2.txt");
		File inFile3 = new File("salidaEjercicios/trozos3.txt");
		File outFile = new File("salidaEjercicios/fichero1_recompuesto.txt");
		try(FileInputStream in1 = new FileInputStream(inFile1);
				FileInputStream in2 = new FileInputStream(inFile2);
				FileInputStream in3 = new FileInputStream(inFile3);
				FileOutputStream out = new FileOutputStream(outFile)){
			int byteLeido;
			while((byteLeido = in1.read()) != -1){
				out.write(byteLeido);
				out.flush();
			}
			while((byteLeido = in2.read()) != -1){
				out.write(byteLeido);
				out.flush();
			}
			while((byteLeido = in3.read()) != -1){
				out.write(byteLeido);
				out.flush();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
