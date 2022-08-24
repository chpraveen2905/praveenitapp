package in.ashokit;

public class BillCollector {

	private IPayment payment;

	/*
	 * This method is polymorphism method
	 */
	public void collectPayment(double amount) {
		System.out.println(payment.getClass().getName());
		String status = payment.pay(amount);
		System.out.println(status);
	}

	public BillCollector() {

	}

	public BillCollector(IPayment payment) {
		System.out.println("BillCollector:: Constructor executed");
		this.payment = payment;
	}
	// We have to initialize payment variable because default its
	// value is null
	// 1. This payment variable can be initialize by setter method.

	// To set value for the payment variable using setter method

	public void setPayment(IPayment payment) {
		System.out.println("setPayment():: setter method executed");
		this.payment = payment;
	}

}
