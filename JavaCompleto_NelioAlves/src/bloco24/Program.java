package bloco24;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		
		System.out.println("Enter contract data.");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Date dd/MM/yyyy: ");
		LocalDate date = LocalDate.parse(sc.next(), formatter);
		System.out.print("Contract value: ");
		Double contractValue = sc.nextDouble();
		
		Contract contract = new Contract(number, date, contractValue);
		
		System.out.print("Enter number of installments: ");
		Integer installmentsNumber = sc.nextInt();
		
		PaymentService ps = new PaymentService(installmentsNumber, new PayPal());
		ps.processContract(contract);
		
		System.out.println();
		System.out.println("Installments: ");
		contract.printInstallments();
		
		sc.close();
	}
}