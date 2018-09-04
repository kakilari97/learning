package com.capg1;
import java.util.ArrayList;
import java.util.Iterator;


public class ALDemo {

	public static void main(String[] args)
	{
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(new Integer(4));
		list.add(5);
		list.add(8);
		list.add(23);
	Iterator<Integer> it=	list.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	//it.hasNext();
	//it.next();
	//	System.out.println(it.next());	
		     }
}
