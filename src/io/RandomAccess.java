package io;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess {

	public static void main(String[] args) {
		RandomAccessFile file = null;
		DataInputStream in = null;
		File position = new File("file/position.txt");
		try {
			in = new DataInputStream(new FileInputStream(position));
			file = new RandomAccessFile("file/data.txt", "rw");
			long pointer = in.readLong();
			in.close();
			file.seek(pointer);
			file.writeBytes("Io bene, e tu??");
			file.close();
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
