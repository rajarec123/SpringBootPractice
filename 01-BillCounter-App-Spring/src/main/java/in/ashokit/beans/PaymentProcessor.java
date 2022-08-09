package in.ashokit.beans;

public class PaymentProcessor {
	// Interface reference variable can hold any implementation class object
	//Field Injection
	private ICardPayment cardPayment = null;
	

	//2 WAYS TO DEPENDENCY INJECTION
	//Construction Injection
	public PaymentProcessor(ICardPayment cardPayment) {
		this.cardPayment = cardPayment;
	}
	
	//Setter Injection
	public void setCardPayment(ICardPayment cardPayment) {
		this.cardPayment = cardPayment;
	}

	public boolean doPayment(Double billAmt) {
		return cardPayment.payBill(billAmt);
	}
}