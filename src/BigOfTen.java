// to find biggest of given 10 numbers input one by one
import java.util.Scanner;

public class BigOfTen {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, big=0, i=1;
		while(i<=10)
		{
			System.out.println("Enter "+i+ " number :");
			n = s.nextInt();
			if(n>big)
				big = n;
			i++;
		}
		System.out.println("Biggest number : "+big);
	}

}
