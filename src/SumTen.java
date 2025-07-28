// to find sum of 10 numbers from input one by one
import java.util.Scanner;
public class SumTen {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n , sum = 0, i = 1;
		while(i<=10)
		{
			System.out.println("Enter new number");
			n = s.nextInt();
			sum = sum + n;
			i++;
		}
		System.out.println("Total of input numbers : "+sum);

	}

}
