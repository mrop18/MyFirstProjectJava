// to check age above 18 or below and invalid in negative input
import java.util.Scanner;

public class AgeCheck {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age :");
		int age = s.nextInt();
		if(age>=18)
			System.out.println("Adult");
		else if(age<0)
			System.out.println("Invalid Age");
		else
			System.out.println("Minor");
		
	}

}
