package flujoEntradaSalida;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestGrupoUsuarios {

	public static void main(String[] args) {
		File outFile = new File("datosSalida/grupoAmigos.bin");
		
		GrupoUsuarios grupoAmigos = new GrupoUsuarios("amigos");
		Usuario u1 = new Usuario("joaquin cortés", 29);
		Usuario u2 = new Usuario("jose perales", 39);
		Usuario u3 = new Usuario("juan garcia", 19);
		Usuario u4 = new Usuario("pedro rodriguez", 49);
		
		grupoAmigos.addUsuario(u1);
		grupoAmigos.addUsuario(u2);
		grupoAmigos.addUsuario(u3);
		grupoAmigos.addUsuario(u4);
		
		System.out.println(grupoAmigos);
		
		try(ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream((outFile))));) {
			out.writeObject(grupoAmigos);
			out.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Tamaño del fichero: "+outFile.length());
		
		//recuperamos el objeto desde el fichero
		try(ObjectInputStream in = new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream(outFile)));) {
			GrupoUsuarios g = (GrupoUsuarios) in.readObject();
			System.out.println(g);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
