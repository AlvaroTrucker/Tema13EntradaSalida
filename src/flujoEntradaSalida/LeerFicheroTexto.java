package flujoEntradaSalida;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LeerFicheroTexto {

	public static void main(String[] args) {
		//Fichero a copiar
		File inFile = new File("datosEntrada/contactos.csv");
		if(inFile.exists()){
			try(FileInputStream in = new FileInputStream(inFile);){
				int bytesLeidos;
				while((bytesLeidos = in.read()) != -1){
					System.out.print((char)bytesLeidos);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
