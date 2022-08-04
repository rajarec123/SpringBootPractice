package in.ashokit.beans;

public class DebitCardPayment implements IPayment {
	
	public DebitCardPayment() {
		System.out.println("**** DebitCardPayment:: Constructor ****");
	}
	
	public boolean payBill(Double billAmt) {
		System.out.println("DebitCard PayBill() got called...!");
		return true;
	}
}