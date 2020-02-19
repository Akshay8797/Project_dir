package com.AkshayKumar;
enum Status {
	NEW(5), ACCEPTED(15), REJECTED(10), COMPLETED(3);
	int value;
	Status(int value) {
		this.value=value;
	}
	public int getValue()
	{
		return this.value;
	}
	public void setValue(int value) {
		this.value = value;
	}
};
public class Order {
	private String name;
	private int status;
	public Order(String name, int id, int qty, int price, int status)
	{
		this.name=name;
		this.status=status;
	}
	@Override
	public String toString()
	{
		return "Emp: "+this.name+" ,Order Status: "+this.status;
	}
	public static void main(String[] args)
	{
		Order o=new Order("A", 10, 5, 20, Status.NEW.getValue());
		System.out.println(o);
	}	
}