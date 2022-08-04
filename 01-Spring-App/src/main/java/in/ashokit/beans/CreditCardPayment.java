package in.ashokit.beans;

public class CreditCardPayment implements IPayment {
	
	public CreditCardPayment() {
		System.out.println("**** CreditCardPayment:: Constructor ****");
	}
	
	public boolean payBill(Double billAmt) {
		System.out.println("CreditCard PayBill() got called...!");
		return true;
	}
}