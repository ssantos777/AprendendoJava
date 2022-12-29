package bloco8;

import java.util.Locale;
import java.util.Scanner;

public class ApplyConverter {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dolPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double quantity = sc.nextDouble();
		double pricePaid = CurrencyConverter.conversion(dolPrice, quantity);
		System.out.printf("Amount to be paid in reais = %.2f%n", pricePaid);
				
		sc.close();
	}
}