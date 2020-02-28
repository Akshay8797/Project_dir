package com.Threading;
public class Triple implements Runnable {
	Thread t1, t2, t3;
	public Triple() {
		t1=new Thread(this);
		t2=new Thread(this);
		t3=new Thread(this);
		t3.setDaemon(true);
		t1.setName("Ping");
		t2.setName("Pong");
		t3.setName("Tom");
		t1.start();
		t2.start();
		t3.start();
	}
	public static void main(String[] args) {
		new Triple();
	}
	@Override
	public void run() {
		Thread curr=Thread.currentThread();
		if(curr.getName().equals("Ping"))
		{
			for(int i=0; i<10; i++) 
			{
				System.out.println("\tPing");
		try {
			Thread.sleep(500);
			}
		catch(InterruptedException e) {
			e.printStackTrace();
			}
		}
		}
		if(curr.getName().equals("Pong"))
		{
			for(int i=0; i<10; i++) {
				System.out.print("\tPong");
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
		if(curr.getName().equals("Tom"))
		{
			for(;;) {
				System.out.println("\tTom");
		try {
			Thread.sleep(500);
			}
		catch(InterruptedException e) {
			e.printStackTrace();
			}
		}
		}
	}
}