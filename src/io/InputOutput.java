package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InputOutput {

	public static void main(String[] args) {
		File fOutput = new File("file/output.txt");
		InputStreamReader in = null;
		OutputStreamWriter out = null;
		try {
			fOutput.createNewFile();
			in = new InputStreamReader(System.in);
			out = new OutputStreamWriter(new FileOutputStream(fOutput));
			int input;
			while( (input = in.read()) != -1 ) {
				out.write(input);
				out.flush();
			}
			out.close();
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

}
