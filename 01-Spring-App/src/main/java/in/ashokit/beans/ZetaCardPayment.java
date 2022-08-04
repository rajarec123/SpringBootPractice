package in.ashokit.beans;

public class ZetaCardPayment implements IPayment {
	
	public ZetaCardPayment() {
		System.out.println("**** ZetaCardPayment:: Constructor ****");
	}
	
	public boolean payBill(Double billAmt) {
		System.out.println("ZetaCard PayBill() got called...!");
		return true;
	}
}