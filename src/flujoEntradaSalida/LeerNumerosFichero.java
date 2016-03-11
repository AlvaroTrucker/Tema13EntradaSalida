package flujoEntradaSalida;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

public class LeerNumerosFichero {

	public static void main(String[] args) {
		File inFile = new File("datosEntrada/numeros.bin");
		if(!inFile.exists()){
			System.out.println("El fichero no existe");
			System.exit(1);
		}
		
		//en el caso que el fichero exista
		try(DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(inFile)));) {
			int numeros;
			while(in.available() != 0){
				numeros = in.readInt();
				System.out.println(numeros);
			}
			
			//while((numeros = in.readUTF()) != null)
				
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
