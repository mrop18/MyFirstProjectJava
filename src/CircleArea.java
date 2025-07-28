// to find area of a circle
// area = PI*radius*radius
import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius of circle :");
		double PI = 3.14;
		int r = s.nextInt();
		double a = PI * r * r;
		System.out.println("Area of Circle : "+a);
	}

}
