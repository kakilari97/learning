 package com.capg1;

import java.util.Scanner;

public class Program37 {

	public static void main(String[] args) {
		
		System.out.println("Enter your username:\n");
		System.out.println(idvalid());
		}
	
static boolean idvalid() {
	Scanner sc= new Scanner(System.in);
	String name=sc.next();
	String substr="_job";
	String user=name+substr;
			//name.substring(0,name.indexOf(substr));
		if(user.length()>=8 && name.length()>=12)
		{
			if(name.endsWith("_job"))
			{
			return true;
		}
		
	}return false;
}
}
