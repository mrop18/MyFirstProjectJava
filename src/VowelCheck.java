// to check input char is vowel or consonant
import java.util.Scanner;

public class VowelCheck {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a single alphabate");
		char ch = s.next().charAt(0);
		
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch + " is a vowel."); break;
			default:
				if(Character.isLetter(ch))
					System.out.println(ch + " is a consonant.");
				else
					System.out.println("Invalid input.");
		}

	}

}
