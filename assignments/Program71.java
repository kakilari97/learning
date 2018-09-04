package com.capg1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Program71 {


	public static void main(String[] args)
	{
		int[] arr= {12, 23, 96, 45};
		getSorted(arr);
	}
	public static int getSorted(int[] arr)
	{
		System.out.println("Before Sorting:");
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(" "+arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			int a=arr[i]%10;
			int b=arr[i]/10;
			int c=a*10+b;
			arr[i]=c;
		}
		System.out.println("Before Sorting:");
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(" "+arr[i]);
		}
		ArrayList<Integer> list=new ArrayList<Integer>();
		Arrays.toString(arr);
		Arrays.sort(arr);
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(" "+arr[i]);
		}
		for(int i=0; i<arr.length;i++)
		{
			list.add(arr[i]);
		}
		Collections.sort(list);
		System.out.println(list);
		return 0;
		
	}
}
