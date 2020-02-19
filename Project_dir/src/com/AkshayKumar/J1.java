package com.AkshayKumar;
class Complex {
	private int real;
	private int img;
	public Complex(int real, int img)
	{
		this.real=real;
		this.img=img;
	}
	public Complex add(Complex n)
	{
		int rsum = this.real+n.real;
		int isum = this.img+n.img;
		Complex c = new Complex(rsum, isum);
		return c;
	}
	public Complex mul(Complex n)
	{
		int rprod = (this.real*n.real)-(this.img*n.img);
		int iprod = (this.img*n.real)+(this.real*n.img);
		Complex c = new Complex(rprod, iprod);
		return c;
	}
	public Complex sub(Complex n)
	{
		int rdiff = this.real-n.real;
		int idiff = this.img-n.img;
		Complex c = new Complex(rdiff, idiff);
		return c;
	}
	public String toString()
	{
		return this.getreal()+" + "+this.getimg()+" i";
	}
	public int getreal()
	{
		return this.real;
	}
	public int getimg()
	{
		return this.img;
	}
	public static void swap (Complex m, Complex n)
	{
		int temp = m.real;
		m.real = n.real;
		n.real=temp;
		temp = m.img;
		m.img=n.img;
		n.img=temp;
	}
}
public class J1 {
	public static void main(String[] args)
	{
		Complex c1 = new Complex(2,5);
		Complex c2 = new Complex(3,7);
		Complex c3 = c1.add(c2);
		System.out.println("Sum: "+c3.toString());
		Complex c4 = c2.sub(c1);
		System.out.println("Difference: "+c4.toString());
		Complex c5 = c1.mul(c2);
		System.out.println("Product: "+c5.toString());
		Complex.swap(c1,c2);
		System.out.println("After Swapping: "+c1.toString()+" and "+c2.toString());
	}
}