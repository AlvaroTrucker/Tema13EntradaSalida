package flujoEntradaSalida;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiarArchivos2 {

	public static void main(String[] args) throws FileNotFoundException {
		//Fichero a copiar
		File inFile = new File("datosEntrada/io1.pdf");
		if(!inFile.exists()){
			System.out.println("Fichero: "+inFile+" no existe");
			System.exit(1);
		}
		
		//Fichero de salida
		File outFile = new File("datosSalida/copiado.pdf");
		try (BufferedInputStream in = new BufferedInputStream(
				new BufferedInputStream(inFile));
				FileOutputStream out = new FileOutputStream(outFile);){
			int byteLeido;
			int contadorBytes = 0;
			long inicio = System.currentTimeMillis();
			while((byteLeido = in.read()) != -1){
				System.out.print(byteLeido);
				contadorBytes++;
				out.write(byteLeido);
			}
			long fin = System.currentTimeMillis();
			System.out.println("\n\nTiempo I/O: "+(fin - inicio));
			System.out.println("Tamaño inicial del fichero: "+inFile.length()+" bytes");
			System.out.println("Bytes leidos: "+contadorBytes);
			System.out.println("Tamaño del fichero de salida: "+outFile.length());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
