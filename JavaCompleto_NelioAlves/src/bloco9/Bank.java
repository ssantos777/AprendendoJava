package bloco9;

import java.util.Locale;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account client;
		double value;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit? (y/n) ");
		char initial = sc.next().charAt(0);
		
		if (initial == 'y' || initial == 'Y') {
			System.out.print("Enter initial deposit value: ");
			value = sc.nextDouble();
			client = new Account(holder, number, value);
		} else {
			client = new Account(holder, number);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(client);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		value = sc.nextDouble();
		client.deposito(value);
		System.out.println("Updated account data: ");
		System.out.println(client);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		client.saque(value);
		System.out.println("Updated account data: " ); // talvez se o programa fosse mais extenso seria interessante fazer um metodo update
		System.out.println(client);
		
		sc.close();
	}

}
