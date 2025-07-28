import java.util.Scanner;
public class Bank {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int bal, amt, ch;
		System.out.println("Enter the current balance");
		bal = s.nextInt();
		do
		{
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Display Balance");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			ch = s.nextInt();
			switch(ch)
			{
				case 1: System.out.println("Enter amount to deposit :");
						amt = s.nextInt();
						bal = bal + amt; break;
				
				case 2: System.out.println("Enter amount to withdraw :");
						amt = s.nextInt();
						if(amt > bal)
							System.out.println("Insuficient balance");
						else
							bal = bal - amt; break;
				
				case 3: System.out.println("Current balance : "+bal); break;
				case 4: System.out.println("Thankyou for banking"); break;
				default: System.out.println("Invalid choice");
			}
		}while(ch!=4);
	}

}
