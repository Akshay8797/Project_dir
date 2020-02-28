package com.Java8;

@FunctionalInterface
interface MultiOp {
	int op(int a, int b);
}

public class Question1 {

	public static void main(String[] args) {
		MultiOp add = (int a, int b) -> (a + b);
		MultiOp sub = (int a, int b) -> (a - b);
		MultiOp mul = (int a, int b) -> (a * b);
		MultiOp div = (int a, int b) -> (a / b);
		System.out.println("Addition: " + add.op(5, 7));
		System.out.println("Subtraction: " + sub.op(12, 8));
		System.out.println("Multiplication: " + mul.op(2, 3));
		System.out.println("Division: " + div.op(20, 10));

	}

}
