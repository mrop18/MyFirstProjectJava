import java.util.Scanner;

class StudentNew{
	int rollNum;
	String studName;
	int mark1, mark2, mark3, totalMarks;
	void setStudDetail(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter roll number: ");
		rollNum = s.nextInt();
		s.nextLine();
		System.out.println("Enter student name: ");
		studName = s.nextLine();
		System.out.println("Enter mark 1: ");
		mark1 = s.nextInt();
		System.out.println("Enter mark 2: ");
		mark2 = s.nextInt();
		System.out.println("Enter mark 3: ");
		mark3 = s.nextInt();
	}
	void calculateTotal(){
		totalMarks = mark1 + mark2 + mark3;
	}
	void displayStudDetails(){
		System.out.println("\n--- Student Details ---");
		System.out.println("Roll Number : "+rollNum);
		System.out.println("Student Name : "+studName);
		System.out.println("Mark 1 : "+mark1);
		System.out.println("Mark 2 : "+mark2);
		System.out.println("Mark 3 : "+mark3);
		System.out.println("Totak marks : "+totalMarks);
		
	}
}
public class StudentDemo {

	public static void main(String[] args) {
		StudentNew s1 = new StudentNew();
		s1.setStudDetail();
		s1.calculateTotal();
		s1.displayStudDetails();

	}

}
