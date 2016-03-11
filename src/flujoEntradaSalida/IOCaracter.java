package flujoEntradaSalida;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOCaracter {

	public static void main(String[] args) {
		//mensaje a enviar
		String mensaje = "Mensaje enviado a fichero\nNueva linea\n";
		
		//fichero de texto de salida (donde vuelco el mensaje)
		File outFile = new File("datosSalida/mensaje.txt");
		
		//definimos los stream de salida  (de tipo caracter)
		try(BufferedWriter out = new BufferedWriter(new FileWriter(outFile));
) {
			//escribimos el mensaje
			out.write(mensaje);
			
			//nos aseguramos de que escribimos inmediatamente
			out.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//hacemos la lectura del fichero
		//usamos BufferedReader y FileReader
		try(BufferedReader in = new BufferedReader(new FileReader(outFile));) {
			String linea;
			while((linea = in.readLine()) != null)
				System.out.println(linea);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
