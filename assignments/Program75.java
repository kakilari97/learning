package com.capg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of items:\n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<String> al=new ArrayList<String>();
		for(int i=0;i<n;i++) {
			al.add(sc.next());
		}
		Collections.sort(al);
		for(String s:al) {
			System.out.println(s);
		}
	}

}
