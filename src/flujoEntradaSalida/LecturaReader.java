package flujoEntradaSalida;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaReader {

	public static void main(String[] args) {
		try(FileReader in = new FileReader(new File("datosSalida/Fichero1"));
) {
			int caracter;
			while((caracter = in.read())!=-1)
				System.out.print((char)caracter);
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
