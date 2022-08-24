package in.ashokit;

public class CreditCardPayment implements IPayment {

	public CreditCardPayment() {
		System.out.println("CreditCardPayment: Constructor executed");
	}
	public String pay(double amount) {
		// TODO Auto-generated method stub
		return "Payment done by Credit Card";
	}

}
