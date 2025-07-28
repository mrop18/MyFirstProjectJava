// biggest number in three with conditional operator 

import java.util.Scanner;

public class BigThreeCO {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		int n1 = s.nextInt();
		System.out.println("Enter second number");
		int n2 = s.nextInt();
		System.out.println("Enter third number");
		int n3 = s.nextInt();
		
		int biggest = (n1>n2) ? ((n1>n3) ? n1 : n3)  : ((n2>n3) ? n2 : n3);
		
		System.out.println("biggest number = "+ biggest);

	}

}
