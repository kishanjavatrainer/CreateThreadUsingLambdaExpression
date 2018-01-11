package com.infotech.client;

public class ClientTest2 {

	public static void main(String[] args) {
		
		Runnable r = ()->{
			for (int i = 1; i <=5; i++) {
				System.out.println(Thread.currentThread().getName()+",i ="+i);
			}
		};
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
