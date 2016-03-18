package ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio4 {
	public static void main(String[] args) {
		//definimos la coleccion de objetos libro
		List<Libro> listaCompletaLibros = new ArrayList<Libro>();
		
		//definimos una lista aleatoria de 10 libros
		Set<Libro> listaDiezLibros = new HashSet<Libro>();
		
		//Definimos el descriptor del fichero
		File inFile = new File("entradaEjercicios/Libros.csv");
		try(FileInputStream inInputStream = new FileInputStream(inFile);
				InputStreamReader inInputStreamReader = new InputStreamReader(inInputStream,"ISO-8859-1");
				BufferedReader in = new BufferedReader(inInputStreamReader);) {
			String linea = in.readLine();
			while((linea=in.readLine()) != null){
				String[] campos = linea.split(";");
				Libro l = new Libro(campos[0], campos[1], campos[2], campos[3], campos[4], campos[5], campos[6], campos[7], campos[8], campos[9], campos[10], campos[11], campos[12]);
				listaCompletaLibros.add(l);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(listaCompletaLibros);
		System.out.println("Total de libros leidos: "+listaCompletaLibros.size());
		while(listaCompletaLibros.size() != 10){
			int libroEscogido = (int) (Math.random()*listaCompletaLibros.size());
			listaDiezLibros.add(listaCompletaLibros.get(libroEscogido));
		}
		System.out.println(listaDiezLibros);
		System.out.println("Tamaño de la nueva lista: "+listaDiezLibros.size());
		
		//guardamos la lista de estos diez libros
		//la lista es un objeto, trabajamos con ObjectOutputStream
		File outFile = new File("salidaEjercicios/libros.txt");
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(outFile));) {
			//escribimos el objeto
			out.writeObject(listaCompletaLibros);
			out.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
