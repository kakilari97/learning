package com.capg1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileProgram {

	public static void main(String[] args) {
		
		FileInputStream fis;
		FileOutputStream fos;
		try {
			fis=new FileInputStream("source.txt");
			fos=new FileOutputStream("target.txt");
			Program81 obj=new Program81(fis,fos);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
