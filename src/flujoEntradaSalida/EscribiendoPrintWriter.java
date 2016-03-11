package flujoEntradaSalida;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EscribiendoPrintWriter {

	public static void main(String[] args) {
		String mensaje = "Esto es una cadena";
		int numeroEntero = 25;
		double numeroDouble = 1.25;
		boolean datoBoolean = true;
		System.out.printf("Mensaje %s, entero %d, double %.2f y boolean %b%n", mensaje, numeroEntero, numeroDouble, datoBoolean);
		try(PrintWriter out = new PrintWriter(new File("datosSalida/ficheroFormateado.txt"));
) {
			out.printf("Mensaje %s, entero %d, double %.2f y boolean %b%n", mensaje, numeroEntero, numeroDouble, datoBoolean);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
