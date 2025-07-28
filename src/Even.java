// to display even numbers from 1 to 100
import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = 1;
		while(i<=100)
		{
			if(i % 2 == 0)
			System.out.print(i+" ");
			i++;
		}

	}

}
