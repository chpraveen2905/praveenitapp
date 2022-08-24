package in.ashokit;

public class DebitCardPayment implements IPayment {

	public DebitCardPayment() {
		System.out.println("DebitCardPayment:: Constructor executed");
	}
	public String pay(double amount) {
		// TODO Auto-generated method stub
		return "Payment done by Debit Card";
	}

}
