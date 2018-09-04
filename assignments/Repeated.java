package com.capg1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class Repeated {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		List<Integer> l2=new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l2.add(1);
		l2.add(23);
		l2.add(31);
		Retain p=new Retain();
		p.removeElements(l1,l2);
	}

}
class Retain
{
	Collection<Integer> removeElements(List<Integer> l1,List<Integer> l2)
	{
		l1.removeAll(l2);
		System.out.println(l1);
		return l1;
	}
}
