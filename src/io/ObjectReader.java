package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader {

	public static void main(String[] args) {
		File file = new File("file/object.txt");
		ObjectInputStream input = null;
		Persona p = null;
		try {
			input = new ObjectInputStream(new FileInputStream(file));
			p = (Persona) input.readObject();
			System.out.println(p.getNome());
			input.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
