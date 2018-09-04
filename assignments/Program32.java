package com.capg1;

import java.util.Scanner;

//import java.util.Scanner;

public class Program32 {

	public static void main(String[] args) {
		System.out.println("Enter a name:\n");
	Scanner sc=new Scanner(System.in);
	String str=sc.next();//"abcd";
	System.out.println(alphabeticalOrder(str.toLowerCase()));
	}
	public static boolean alphabeticalOrder(String str)
	{
		for(int i=0;i<str.length()-1;i++)
			if(str.charAt(i)>str.charAt(i+1))
			{
				return false;
			}
	
	return true;
	
	
	}
}