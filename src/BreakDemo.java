import java.util.Scanner;
public class BreakDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, sum = 0;
		while(true) //infinite loop
		{
			System.out.println("Enter a number or to stop enter Zero(0)");
			n= s.nextInt();
			if(n==0)
				break;
			sum = sum + n;
		}
		System.out.println("Sum = " + sum);
	}

}
