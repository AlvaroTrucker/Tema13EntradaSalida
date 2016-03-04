package introduccion;

import java.io.File;
import java.io.FilenameFilter;

public class FiltradoArchivos {

	public static void main(String[] args) {
		File inFile = new File("/home/matinal/");
		if(inFile.isDirectory()){
			String[] ficherosJava = inFile.list(
					new FilenameFilter() {
						
						@Override
						public boolean accept(File dir, String name) {
							// TODO Auto-generated method stub
							return name.endsWith(".java");
						}
					});
			for (String file : ficherosJava) {
				System.out.println(file);
			}
		}
	}

}
