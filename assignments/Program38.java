package com.capg1;
import java.util.Scanner;

public class Program38 {
	public static void main(String[] args) {
	
		int n;
		String temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of names");
		n=sc.nextInt();
		String[] names=new String[n];
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter all the names: \n");
		for(int i=0;i<n;i++) {
			names[i]=sc1.nextLine();
			
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++) {
				if(names[i].compareTo(names[j])>0) {
					temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		System.out.println("Names in sorted order:");
		for(int i=0;i<n;i++)
		{
			int len=names[i].length();
			if(len%2==0) {
			String secondhalf=(names[i].substring(names[i].length()/2)).toLowerCase();
			String firsthalf=(names[i].substring(0,(names[i].length()/2))).toUpperCase();
			names[i]=firsthalf+secondhalf;
			}else if(len%2!=0) {
				String secondhalf=(names[i].substring((names[i].length()/2)+1)).toLowerCase();
				String firsthalf=(names[i].substring(0,(names[i].length()/2)+1)).toUpperCase();
				names[i]=firsthalf+secondhalf;
			}
			System.out.println(names[i]);
		}
	}

}
