package com.Threading;
public class Anonymous extends Thread {
	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			public void run() {
				for(int i=0;i<20;i++) {
					System.out.println("PING");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Runnable r2 = new Runnable() {
			public void run() {
				for(int i=0;i<20;i++) {
					System.out.println("\tPONG");
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
}
}