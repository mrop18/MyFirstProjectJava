// to find sum of even numbers and odd number from 1 - 100

public class OddEvenSum {

	public static void main(String[] args) {
		int i=1, sumEven = 0, sumOdd=0;
		while(i<=100)
		{
			if(i % 2 == 0) {
				sumEven = sumEven + i;
				i++;
			}else {
				sumOdd = sumOdd + i;
				i++;
			}
			
		}
		System.out.println("Sum of even numbers : "+sumEven);
		System.out.println("Sum of odd numbers : "+sumOdd);
	}

}
