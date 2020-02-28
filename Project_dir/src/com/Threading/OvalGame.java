package com.Threading;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class OvalGame extends Frame implements Runnable {
	private static final long serialVersionUID = 1L;
	int y1 = 400, y2 = 400, y3 = 400;

	public OvalGame() {
		Thread t1 = new Thread(this);
		t1.setName("Red");
		t1.start();
		Thread t2 = new Thread(this);
		t2.setName("Green");
		t2.start();
		Thread t3 = new Thread(this);
		t3.setName("Blue");
		t3.start();
		setBackground(Color.CYAN);
		setSize(500, 500);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(100, y1, 50, 50);
		g.setColor(Color.GREEN);
		g.fillOval(200, y2, 50, 50);
		g.setColor(Color.BLUE);
		g.fillOval(300, y3, 50, 50);
	}

	public static void main(String[] args) {
		Frame mf = new OvalGame();
		mf.setSize(500, 500);
		mf.setVisible(true);
	}

	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("Red")) {
			while (true) {
				while (y1 > 100) {
					y1 = y1 - 3;
					repaint();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				while (y1 != 400) {
					y1 = y1 + 3;
					repaint();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		if (Thread.currentThread().getName().equals("Green")) {
			while (true) {
				while (y2 > 100) {
					y2 = y2 - 3;
					repaint();
					try {
						Thread.sleep(120);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				while (y2 != 400) {
					y2 = y2 + 3;
					repaint();
					try {
						Thread.sleep(120);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		if (Thread.currentThread().getName().equals("Blue")) {
			while (true) {
				while (y3 > 100) {
					y3 = y3 - 3;
					repaint();
					try {
						Thread.sleep(140);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				while (y3 != 400) {
					y3 = y3 + 3;
					repaint();
					try {
						Thread.sleep(140);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}