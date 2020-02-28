package com.Training.Assessment;

class TravelAgent {
	private String from;
	private String to;
	private String seat;
	private int price;

	public TravelAgent(String from, String to, String seat, int price) {
		this.from = from;
		this.to = to;
		this.seat = seat;
		this.price = price;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getCom() {
		return 0.02 * price;
	}

	public double getInsurance() {
		return 0.01 * price;
	}
}

class Railway extends TravelAgent {
	@SuppressWarnings("unused")
	private String sType;

	public Railway(String from, String to, String seat, int price, String sType) {
		super(from, to, seat, price);
		this.sType = sType;
	}
}

class Flight extends TravelAgent {
	private double weight;

	public Flight(String from, String to, String seat, int price, double weight) {
		super(from, to, seat, price);
		this.weight = weight;
	}

	public double getCom() {
		if (weight > 15.0)
			return (this.getPrice() * .03);
		else
			return super.getCom();
	}
}

class Bus extends TravelAgent {
	public Bus(String from, String to, String seat, int price) {
		super(from, to, seat, price);
	}
}

public class Week1_Q2 {
	public static double cost = 0.0;

	public static double getSum(TravelAgent t[]) {
		for (int i = 0; i < t.length - 1; i++)
			cost = cost + (t[i].getPrice() + t[i].getCom() + t[i].getInsurance());
		return cost;
	}

	public static void main(String[] args) {
		TravelAgent t[] = new TravelAgent[10];
		t[0] = new Bus("A", "B", "R-1", 2000);
		t[1] = new Bus("B", "C", "R-2", 3000);
		t[2] = new Railway("D", "E", "A-1", 3500, "2A");
		t[3] = new Railway("E", "F", "S-1", 900, "SL");
		t[4] = new Railway("F", "G", "S-2", 800, "SL");
		t[5] = new Flight("G", "H", "RW-1", 12000, 15.5);
		t[6] = new Flight("H", "I", "RW-2", 16000, 12);
		t[7] = new Flight("I", "J", "RW-3", 10000, 10.5);
		t[8] = new Flight("J", "K", "RW-4", 13000, 8.8);
		t[9] = new Flight("K", "L", "RW-5", 15000, 16);
		System.out.println(getSum(t));
	}
}