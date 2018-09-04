package com.capg1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program91 {

	public static void main(String[] args) throws IOException {

		Scanner s = new Scanner(new File("input.txt")).useDelimiter("\\2");
		String contents = s.next();
		System.out.println("Original content is:\n" + contents);
		contents = new StringBuilder(contents).reverse().toString();
		System.out.println("Reversed contents:\n" + contents);
		FileWriter fwt = new FileWriter("output.txt");
		BufferedWriter br = new BufferedWriter(fwt);
		br.write(contents);
		br.close();
		s.close();
	}

}
