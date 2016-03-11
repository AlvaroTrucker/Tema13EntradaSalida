package flujoEntradaSalida;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class AccesoAleatorio {

	public static void main(String[] args) {
		try(RandomAccessFile rFile = new RandomAccessFile(
					new File("datosSalida/accesoaleatorio.bin"), "rw");) {
			System.out.println("Tamaño del fichero: "+rFile.length());
			rFile.writeDouble(20);
			System.out.println("Tamaño del fichero: "+rFile.length());
			rFile.writeInt(15);
			System.out.println("Tamaño del fichero: "+rFile.length());
			rFile.seek(0);
			System.out.println("Bytes almacenados: "+rFile.readByte());
			rFile.seek(0);
			System.out.println("Leyendo entero: "+rFile.readInt());
			rFile.seek(0);
			System.out.println("Leyendo double: "+rFile.readDouble());
			rFile.skipBytes(4);
			System.out.println("Posicion actual del puntero: "+rFile.getFilePointer());
			rFile.writeFloat(5f);
			System.out.println("Posicion actual del puntero: "+rFile.getFilePointer());
			System.out.println("Tamaño actual: "+rFile.length());
			rFile.setLength(0);
			System.out.println("Tamaño actual: "+rFile.length());
			rFile.writeChars("hola");
			System.out.println(rFile.length());
			System.out.println("Posicion actual del puntero: "+rFile.getFilePointer());
			rFile.seek(2);
			System.out.println("Caracter en el 2: "+rFile.readChar());
			rFile.seek(3);
			System.out.println("Caracter en el 3 y 4: "+rFile.readChar());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
