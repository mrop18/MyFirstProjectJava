// to accept and display roll number, name and marks in 3 subjects. find total and average.
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter Roll Number :");
		int rollNum = s.nextInt();
		
		System.out.println("Please enter Student Name :");
		String name = s.next();
		
		System.out.println("Please enter marks in Physics :");
		double physics = s.nextDouble();
		
		System.out.println("Please enter marks in Chemistry :");
		double chemistry = s.nextDouble();
		System.out.println("Please enter marks in Maths :");
		double maths = s.nextDouble();
		double total = 300;
		double totalMarks = physics + chemistry + maths;
		double avg = totalMarks / 3;
		
		System.out.println("Roll Number = "+rollNum);
		System.out.println("Student Name = "+name);
		System.out.println("Physics = "+physics+" / 100");
		System.out.println("Chemistry = "+chemistry+" / 100");
		System.out.println("Maths = "+maths+" / 100");
		System.out.println("Total Marks = "+totalMarks+" / 300");
		System.out.println("Average Marks = "+avg);
	}

}
