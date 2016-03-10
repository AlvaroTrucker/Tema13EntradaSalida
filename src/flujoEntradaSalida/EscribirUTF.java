package flujoEntradaSalida;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscribirUTF {

	public static void main(String[] args) {
		File outFile = new File("datosSalida/utf.txt");
		try(DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(outFile)));) {
			for (int i = 0; i < 100; i++) {
				out.writeUTF(str);
				out.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
