package com.Threading;
public class HasAPingPong extends Thread {
	public HasAPingPong(String tName) {
		super.setName(tName);
		super.start();
	}
	public static void main(String[] args) {
		new HasAPingPong("Ping");
		new HasAPingPong("Pong");
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