package com.capg1;
import java.util.Scanner;
public class Program31 {
	public static void main(String[] args) {
		String str1;
		int choice;
Scanner sc=new Scanner(System.in);
Scanner ch=new Scanner(System.in);
str1=sc.next();
choice=ch.nextInt();
switch(choice)
{
case 1:
	String str2=str1+str1;
	System.out.println(str2);
	break;
case 2:
	for(int i=0;i<=str1.length();i++)
	{
		if(i%2!=0) {
			str1=str1.substring(0,i-1)+"#"+str1.substring(i,str1.length());
		}
	}
	System.out.println(str1);
	break;
case 3:
	int l=str1.length();
	char dup;
	String ans=" ";
	for(int j=0;j<l;j++)
	{
		dup=str1.charAt(j);
		if(dup!=' ')
			ans=ans+dup;
		str1=str1.replace(dup, ' ');
	}
	System.out.println(ans);
	break;
case 4:
	int f=0;
	char chi;
	
	for( f=0;f<str1.length();f++) {
		 chi=str1.charAt(f);
		if(f%2==0) {
			System.out.print(Character.toLowerCase(chi));
		}else
			System.out.print(Character.toUpperCase(chi));
	}
	break;
default:
		System.out.println("Choose a valid option!");
}
}
}
