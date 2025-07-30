// to check a input number is prime or not
import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check if prime or not :");
		int n = s.nextInt();
		boolean isPrime = true;
		
		if(n<=1) {
			isPrime = false;
		} else {
			for(int i=2; i<= n/2; i++) {
				if(n % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		if(isPrime) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}

	}

}
