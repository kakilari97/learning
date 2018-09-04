package com.capg1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program34 {

	public static void main(String[] args) {
		
		DateTimeFormatter date=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first date:\n");
		String date1=sc.next();
		LocalDate myDate1=LocalDate.parse(date1,date);
		System.out.println("Enter the second date:\n");
		String date2=sc.next();
		LocalDate myDate2=LocalDate.parse(date2,date);
		
		Period diff=myDate1.until(myDate2);
		System.out.println("Difference is "+diff.getYears()+" years, "+ diff.getMonths()+ " months and "+ diff.getDays()+ " days\n");

	}

}
