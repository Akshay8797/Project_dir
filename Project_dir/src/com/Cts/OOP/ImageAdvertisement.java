package com.Cts.OOP;

public class ImageAdvertisement extends Advertisement {
	private int inches;
	private float base;
	private String p;
	private int n;

	public ImageAdvertisement(int advertisementId, String priority, int noOfDays, String clientName, int inches) {
		super(advertisementId, priority, noOfDays, clientName);
		this.inches = inches;
	}

	public int getInches() {
		return inches;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}

	@Override
	public float calculateAdvertisementCharge(float baseCost) {
		n = super.getNoOfDays();
		float cost = 0;
		base = baseCost * n * inches;
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