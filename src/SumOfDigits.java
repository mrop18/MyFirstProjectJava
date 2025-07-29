// to find sum of digits of given number
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = s.nextInt();
		int sum = 0;
		
		while(n>0) {
			int digit = n%10; // get digit last number by reminder
			sum += digit;
			n = n/10; // remove last digit from number
		}
		System.out.println("Sum of digits : "+sum);
		
		
		

	}

}
