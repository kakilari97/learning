
package com.capg1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program33 {

	public static void main(String[] args) {
	
		DateTimeFormatter date=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date");
		String s=sc.next();
		LocalDate myDate=LocalDate.parse(s,date);
		LocalDate today=LocalDate.now();
		Period diff=myDate.until(today);
		
	//	LocalDate pdate=LocalDate.of(1997,06,05);
//		LocalDate now=LocalDate.now();
//		Period diff=Period.between(pdate, now);
		
		System.out.println("Difference is "+diff.getYears()+" years "+diff.getMonths()+" months "+diff.getDays()+" days ");
		

	}

}
