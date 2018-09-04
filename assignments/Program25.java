package com.capg1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import com.capg1.gender.Genderchoice;
enum Gender{
	M,F,m,f;
}
 public class Program25 {

	public static void main(String[] args) {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome!\n");
		try {
			PersonMain p1=new PersonMain();
			System.out.println("Enter first name:\n");
			String firstName=br.readLine();
			p1.setFirstName(firstName);
			
			System.out.println("Enter last name:\n");
			String lastName=br.readLine();
			p1.setLastName(lastName);
			System.out.println("Enter gender:\n");
			char gender=br.readLine().charAt(0);
			
			outer:while(true) {
				for(Gender g:Gender.values()) {
					if(gender==(g.name().charAt(0)));
					{
						System.out.println(p1.toString());
						break outer;
					}
				}
				System.out.println("Wrong gender try again!\n");
				gender=br.readLine().charAt(0);
			}
			p1.setGender(gender);
			System.out.println("Enter Number");
			String mobnum=br.readLine();
			p1.setMobnum(mobnum);
		}catch(IOException e) {
			e.printStackTrace();
		}
			
		}
	}


