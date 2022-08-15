package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriter {

	public static void main(String[] args) {
		File file = new File("file/object.txt");
		ObjectOutputStream out = null;
		Persona p = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream(file));
			p = new Persona("Simone", "Spaccarotella", 25);
			out.writeObject(p);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
