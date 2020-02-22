package com.Cts.OOP;

public class VideoAdvertisement extends Advertisement {
	private int duration;
	private float base;
	private String p;
	private int n;

	public VideoAdvertisement(int advertisementId, String priority, int noOfDays, String clientName, int duration) {
		super(advertisementId, priority, noOfDays, clientName);
		this.duration = duration;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public float calculateAdvertisementCharge(float baseCost) {
		n = super.getNoOfDays();
		float cost = 0;
		base = baseCost * n * duration;
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