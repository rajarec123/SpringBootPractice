package in.ashokit.beans;

public class PaymentProcessor {
	
	private IPayment payment;
	
	public PaymentProcessor(IPayment payment) {
		System.out.println("**** PaymentProcessor:: Constructor ****");
		this.payment = payment;
	}
	
	//Setter Injection
	/* public void setCardPayment(IPayment payment) { 
	 * this.payment = payment; } */

	public void doPayment(Double billAmt) {
		boolean isPayment = payment.payBill(billAmt);
		if(isPayment) {
			System.out.println("Payment completed successfully...!");
		} else {
			System.out.println("Failed to completed payment...!");
		}
	}
}