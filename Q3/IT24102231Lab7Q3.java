import java.util.Scanner;
public class IT24102231Lab7Q3 {
    public static void main(String[]args) {
	    Scanner reader = new Scanner(System.in);
		
		for(int customer = 1;customer <= 5;customer++) {
System.out.println("Customer " + customer);
            System.out.print("Enter total bill aamount: ");
			double totalBill = reader.nextDouble();
			
			System.out.print("Enter mode of payment (C for cash, O for other): ");
			char paymentMode = reader.next().charAt(0);
			paymentMode = Character.toUpperCase(paymentMode);
			
			if(paymentMode == 'C') {
			   double discount = totalBill * 0.05;
			   double amountToBePaid = totalBill - discount;
System.out.println("Discount is: " + discount);
System.out.println("Amount to be paid: " + amountToBePaid);
            } else if(paymentMode == 'O') {
System.out.println("No discount applicable");
System.out.println("Amount to be paid: " + totalBill);
            } else {
System.out.println("Payment Mode is Not Valid");
            }
System.out.println();
        }
	}
}