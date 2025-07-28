import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the number to check :");
		int n = s.nextInt();
		
		if(n>0)
			System.out.println("Positive");
		else
			if(n<0)
				System.out.println("Negative");
			else
				System.out.println("Zero");

	}

}
