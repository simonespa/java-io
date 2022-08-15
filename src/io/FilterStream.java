package io;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FilterStream {

	public static void main(String[] args) {
		RandomAccessFile file = null;
		DataOutputStream out = null;
		File position = new File("file/position.txt");
		try {
			out = new DataOutputStream(new FileOutputStream(position));
			file = new RandomAccessFile("file/data.txt", "rw");
			file.writeBytes("ciao, come stai?");
			long pointer = file.getFilePointer();
			out.writeLong(pointer);
			file.close();
			out.close();
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}