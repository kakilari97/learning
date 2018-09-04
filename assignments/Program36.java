package com.capg1;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Program36 {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the zome:\n");
			String zone=sc.nextLine();
			System.out.println("The time in the zone is: "+ZonedDateTime.now(ZoneId.of(zone)));
	}

}
