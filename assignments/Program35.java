package com.capg1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Program35 {

	public static void main(String[] args) {
		
		DateTimeFormatter date=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter purchase date in dd/MM/yyyy format:\n");
		String s=sc.next();
		
		LocalDate purchaseDate=LocalDate.parse(s,date);
		System.out.println("Enter warranty period in number of months:\n");
		
		int warranty=sc.nextInt();
		
		System.out.println("Expiry date will be: "+purchaseDate.plusMonths(warranty));
	}

}
