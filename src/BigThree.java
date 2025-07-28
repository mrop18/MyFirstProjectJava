// to find biggest of given three numbers
import java.util.Scanner;

public class BigThree {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		int n1 = s.nextInt();
		System.out.println("Enter second number");
		int n2 = s.nextInt();
		System.out.println("Enter third number");
		int n3 = s.nextInt();
		
		if (n1>n2 && n1>n3)
			System.out.println("Biggest number is : "+n1);
		else
			if(n2>n3)
				System.out.println("Biggest number is : "+n2);
			else
				System.out.println("Biggest number is : "+n3);

	}

}
