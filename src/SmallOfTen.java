// to find smallest number from 10 inputs
import java.util.Scanner;
public class SmallOfTen {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, sm, i=1;
		System.out.println("Enter "+i+ " number :");
		sm = s.nextInt();
		i++;
		while(i<=10)
		{
			System.out.println("Enter "+i+ " number :");
			n = s.nextInt();
			if(n<sm)
				sm = n;
			i++;
		}
		System.out.println("Smallest number : "+sm);

	}

}
