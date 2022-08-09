package in.ashokit.beans;

public class CreditCardPayment implements ICardPayment {
	public boolean payBill(Double billAmt) {
		System.out.println("Paying Bill Amt Using CReditCard :"+billAmt);
		
		// logic to check credit availability
		return true;
	}
}