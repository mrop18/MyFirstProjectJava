import java.util.Scanner;

class Account {
	int accNum;
	String accType;
	int accBal = 0;
	int ach;
	Scanner s = new Scanner(System.in);

	Account() {
		System.out.println("Enter Account Number : ");
		accNum = s.nextInt();
		s.nextLine();

		System.out.println("Enter Accout Type (1 or 2)");
		do {
			System.out.println("1. Saving Account");
			System.out.println("2. Current Account");
			ach = s.nextInt();
			switch(ach) {
			case 1: System.out.println("Saving Account");
					accType = "Saving Account"; break;
					
			case 2: System.out.println("Current Account");
					accType = "Current Account"; break;
			default: System.out.println("Invalid choice");
			}
			
		}while(ach != 1 && ach != 2);
	}
	
	void deposit() {
		System.out.println("Enter amount to deposit : ");
		int amt = s.nextInt();
		if (amt > 0) {
			accBal = accBal + amt;
			System.out.println("Deposited : "+amt);
		}
		else
			System.out.println("Invalid depoist amount.");
	}
	
	void withdraw() {
		System.out.println("Enter amount to withdraw : ");
		int amt = s.nextInt();
		if(amt <= 0) {
			System.out.println("Invalid withdrawal amount.");
		} else if(amt > accBal) {
			System.out.println("Insufficient balance.");
		} else {
			accBal = accBal - amt;
			System.out.println("Withdrawn : "+amt);
		}
	}

	void dispAccDetails() {
		System.out.println("\n--- Account Details ---");
		System.out.println("Account Number : "+accNum);
		System.out.println("Account Type : "+accType);
		System.out.println("Account Balance : "+accBal);

	}
}

public class BankDemo {

	public static void main(String[] args) {
		Account acc = new Account();
		
		
		int ch;
		do {
			System.out.println("\nChoose an operation:");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Show Account Details");
			System.out.println("4. Exit");
			
			ch = acc.s.nextInt();
			
			switch(ch) {
			case 1: acc.deposit(); break;
			case 2: acc.withdraw(); break;
			case 3: acc.dispAccDetails(); break;
			case 4: System.out.println("Thankyou for banking with us."); break;
			default: System.out.println("Invalid Choice");
			}
		} while (ch!=4);
	}
}
