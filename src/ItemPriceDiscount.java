/* Accept item number, item name, rate, quantity. Find price with rate*quantity
 * now calculate discount
 * 0% if price below 1000
 * 10% if price between 1000 - 2000
 * 15% if price between 2000 - 3000
 * 20% if price between 3000 - 5000
 * 25% if price above 5000
 */

import java.util.Scanner;

public class ItemPriceDiscount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter item number");
		int itemNum = s.nextInt();
		System.out.println("Enter item name");
		String itemName = s.next();
		System.out.println("Enter item rate");
		double itemRate = s.nextInt();
		System.out.println("Enter item quantity");
		int itemQuan = s.nextInt();
		
		double itemPrice = itemRate * itemQuan;
		double discount;
		
		if(itemPrice>=1000 && itemPrice<2000)
			discount = 0.1;
		else if(itemPrice>=2000 && itemPrice<3000)
			discount = 0.15;
		else if(itemPrice>=3000 && itemPrice<5000)
			discount = 0.2;
		else if(itemPrice>=5000)
			discount = 0.25;
		else
			discount = 0;
		
		double totalDiscount = itemPrice * discount;
		double finalPrice = itemPrice - totalDiscount;
		
		System.out.println("Purchased Order Details :");
		System.out.println("Item number : "+itemNum);
		System.out.println("Item name : "+itemName);
		System.out.println("Rate : "+itemRate);
		System.out.println("Quantity : "+itemQuan);
		System.out.println("Total Price : "+itemPrice);
		System.out.println("Discount at discount rate "+discount*100+ "% : "+totalDiscount );
		System.out.println("Grand Total : "+finalPrice);
		

	}

}
