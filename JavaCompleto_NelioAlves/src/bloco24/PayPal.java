package bloco24;

public class PayPal implements PaymentInterface {

	public Double paymentTax(Double value, Integer installmentNumber) {
		
		double amount = value * (1 + (0.01 * installmentNumber));
		amount = amount + (amount * 0.02);
		
		return amount;
	}
}