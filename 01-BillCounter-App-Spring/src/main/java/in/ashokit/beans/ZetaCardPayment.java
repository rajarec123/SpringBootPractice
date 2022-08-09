package in.ashokit.beans;

public class ZetaCardPayment implements ICardPayment {
	public boolean payBill(Double billAmt) {
		System.out.println("Paying Bill Amt Using ZetaCard :"+billAmt);
		
		// logic to check credit availability
		return true;
	}
}