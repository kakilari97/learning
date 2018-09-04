package com.capg1;

public class Program82 implements Runnable{
	
	static int counter=0;

	public static void main(String[] args) {
		Program82 obj=new Program82();
		Thread t=new Thread(obj);
		t.start();
	}

	@Override
	public void run() {
		while(true)
		{
			try {
				System.out.println(System.currentTimeMillis());
				Thread.sleep(10000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}
