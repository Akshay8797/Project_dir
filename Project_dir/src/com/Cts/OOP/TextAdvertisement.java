package com.Cts.OOP;

public class TextAdvertisement extends Advertisement {
	private int noOfChars;
	private float base;
	private String p;
	private int n;

	public TextAdvertisement(int advertisementId, String priority, int noOfDays, String clientName, int noOfChars) {
		super(advertisementId, priority, noOfDays, clientName);
		this.noOfChars = noOfChars;
	}

	public int getNoOfChars() {
		return noOfChars;
	}

	public void setNoOfChars(int noOfChars) {
		this.noOfChars = noOfChars;
	}

	@Override
	public float calculateAdvertisementCharge(float baseCost) {
		n = super.getNoOfDays();
		float cost = 0;
		base = baseCost * n * noOfChars;
		p = super.getPriority();
		if (p.equals("high")) {
			cost = (float) (base + (.1 * base) + 1000);
		} else if (p.equals("medium")) {
			cost = (float) (base + (.07 * base) + 700);
		} else if (p.equals("low")) {
			cost = (float) (base + 200);
		}
		return cost;
	}
}