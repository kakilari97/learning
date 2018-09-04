package com.capg1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program74 {

	public static Map getSquares(int[] a) {
		int n=a.length;
		int[] sar=new int[n];
		for(int i=0;i<n;i++) {
			sar[i]=a[i]*a[i];
		}
		Map<Integer,Integer> h=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			h.put(a[i], sar[i]);
		}
		return(h);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of items:\n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		Map<Integer,Integer> h1= new HashMap<Integer,Integer>();
		h1=getSquares(ar);
		System.out.println(h1);
	}

}
