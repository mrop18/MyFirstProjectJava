// to check given number is even or odd
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a number to check :");
		int n = s.nextInt();
		if(n % 2 == 0)
			System.out.println("Number is Even");
		else 
			System.out.println("Number is Odd");

	}

}
