import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length");
		int length = s.nextInt();
		System.out.println("Enter the width");
		int width = s.nextInt();
		int area = length * width;
		System.out.println("Area of Rectangle = " + area);

	}

}
