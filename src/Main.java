public class Main {

	public static void main(String[] args) {
		
		// this is my first program
		/*
		 this is
		 multi-line
		 comment
		...
		 */
		System.out.print("I like Pizza!\n");
		System.out.println("It's really good.");
		System.out.println("Buy me pizza.");
		
		// variable 
		
		// Primitive           Reference
		// ........            ........
		// int					string
		// double				array
		// char					object
		// boolean
		
		// steps to creating a variable
		// 1. Declaration 
		// 2. assignment
		
		int age = 30;
		int year = 2025;
		
		System.out.println(age);
		System.out.println("The year is " + year);
		
		double price = 3.85;
		System.out.println(price + " Rs");
		
		double temp = -12.5;
		System.out.println(temp);
		
		char grade = 'A';
		char symbol = '!';
		System.out.println("Grade is " + grade + " , Symbol is " + symbol);
		
		// boolean isStudent = true;
		boolean forSale = false;
		// System.out.println(isStudent);
		System.out.println(forSale);
		
		
		boolean isStudent = false;
		
		if(isStudent) {
			System.out.println("You are a student");
		} else {
			System.out.println("You are not a student");
		}
		
		
		String name = "Om Prakash Kumawat";
		
		System.out.println("Hello " + name);
		
		String food = "pizza";
		
		System.out.println("My favourite food is " + food);
	}
}
