package com.capg1;

public class ProgramMain41 {

	public static void main(String[] args) {
	
		Program41Person p1=new Program41Person();
		Program41Person p2=new Program41Person();
		Program41Account a1=new Program41Account();
		Program41Account a2=new Program41Account();
			
			p1.setName("Kathy");
			p1.setAge(21);
			a1.setBalance(000);
			p2.setName("Smith");
			p2.setAge(30);
			a2.setBalance(2000);
			
			a1.getAccNum();
			a2.getAccNum();
			
			a1.withdraw(2000);
			a2.deposit(2000);
			
			System.out.println(p1);
			System.out.println(a1);
			System.out.println(p2);
			System.out.println(a2);
	}

}
