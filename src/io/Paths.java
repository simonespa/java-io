package io;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Paths {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/etc/rc0.d/K01atd").toRealPath();
		System.out.println(path);
	}

}
