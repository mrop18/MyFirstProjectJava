package mypack2;

import mypack1.Calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println("Sum = "+c.add(10, 20));
		System.out.println("Multiply = "+c.multiply(5, 4));

	}

}
