package in.ashokit.main;

import in.ashokit.beans.DebitCardPayment;
import in.ashokit.beans.PaymentProcessor;
import in.ashokit.beans.ZetaCardPayment;

public class Main {
	public static void main(String[] args) {	
		PaymentProcessor processor = new PaymentProcessor(new DebitCardPayment()); //CI

	//Injecting dependent object into target object using setter() -SI
		processor.setCardPayment(new ZetaCardPayment());

		boolean paymentStatus = processor.doPayment(1345.90);
		if (paymentStatus)
			System.out.println("Payment processed successfully...!");
		else
			System.out.println("Failed to process payment...!");
	}
}