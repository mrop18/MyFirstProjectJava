import java.util.Scanner;

class Student2{
	int rollNum;
	String studName;
	int mark1, mark2, mark3, totalMarks;
	
	Student2(int r, String name, int m1, int m2, int m3){
		rollNum = r;
		studName = name;
		mark1 = m1;
		mark2 = m2;
		mark3 = m3;
	}
	void calculateTotal() {
		totalMarks = mark1 + mark2 + mark3;
	}
	
	void displayStudDetails() {
		System.out.println("\n--- Student Details ---");
		System.out.println("Roll Number : "+rollNum);
		System.out.println("Name : "+studName);
		System.out.println("Mark 1 :"+mark1);
		System.out.println("Mark 2 :"+mark2);
		System.out.println("Mark 3 :"+mark3);
		System.out.println("Total Marks :"+totalMarks);
	}
	
}
public class StudentDemoConstructor {

	public static void main(String[] args) {
//		Student2 s1 = new Student2(101, "Om Prakash", 50, 65, 90); 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Roll Number : ");
		int roll = s.nextInt();
		s.nextLine();
		
		System.out.println("Enter Student Name : ");
		String name = s.nextLine();
		
		System.out.println("Enter mark 1 : ");
		int m1 = s.nextInt();
		
		System.out.println("Enter mark 2 : ");
		int m2 = s.nextInt();
		
		System.out.println("Enter mark 3 : ");
		int m3 = s.nextInt();
		
		Student2 s1 = new Student2(roll, name, m1, m2, m3);
		s1.calculateTotal();
		s1.displayStudDetails();
		

	}

}
