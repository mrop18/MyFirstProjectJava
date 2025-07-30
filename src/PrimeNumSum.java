// to sum prime numbers from 2-100
public class PrimeNumSum {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int n=2; n<=100; n++) {
			boolean isPrime = true;
			for(int i=2; i<=n/2; i++) {
				if(n % i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				sum = sum + n;
			}
		}
		System.out.println("Sum of prime numbers from 2 to 100 is: " + sum);

	}

}
