// to display multiplication table of input number
import java.util.Scanner;

public class MuliplicationTable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number for table :");
		int n = s.nextInt();
		int r;
		
		for(int i = 1; i<=10; i++) {
			r = n*i;
			System.out.println(n+" * "+i+" = "+r);
		}
		

	}

}
