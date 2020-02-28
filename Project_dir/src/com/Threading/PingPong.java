package com.Threading;

public class PingPong implements Runnable {
	Thread t1, t2;
	public PingPong() {
		t1=new Thread(this);
		t2=new Thread(this);
		t1.setName("Ping");
		t2.setName("Pong");
		t1.start();
		t2.start();
	}
	public static void main(String[] args) {
		new PingPong();
	}
	@Override
	public void run() {
		Thread curr=Thread.currentThread();
		if(curr.getName().equals("Ping"))
		{
			for(int i=0; i<10; i++)
				System.out.println("Ping");
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
		if(curr.getName().equals("Pong"))
		{
			for(int i=0; i<10; i++)
				System.out.println("Pong");
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}
