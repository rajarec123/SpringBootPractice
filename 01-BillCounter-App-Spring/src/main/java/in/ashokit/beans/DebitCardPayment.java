package in.ashokit.beans;

public class DebitCardPayment implements ICardPayment {
	public boolean payBill(Double billAmt) {
		System.out.println("Paying Bill Amt Using DebitCard :"+billAmt);
		
		// logic to check credit availability	
		return true;
	}
}