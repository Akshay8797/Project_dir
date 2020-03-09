package com.Junit;

public class Complex {
	private int real;
	private int img;

	public Complex(int real, int img) {
		this.real = real;
		this.img = img;
	}

	public Complex add(Complex n) {
		int rsum = this.real + n.real;
		int isum = this.img + n.img;
		Complex c = new Complex(rsum, isum);
		return c;
	}

	public int getReal() {
		return real;
	}

	public int getImg() {
		return img;
	}

	@Override
	public boolean equals(Object o) {
		Complex c3 = (Complex) o;
		if ((this.real == c3.real) && (this.img == c3.img))
			return true;
		else
			return false;
	}
}