package bloco8;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double conversion(double price, double quantity) {
		return price * quantity * (1.0 + IOF);
	}
}
