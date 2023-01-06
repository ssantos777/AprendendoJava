package bloco17;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter account data.");
			
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();
			
			Account c = new Account(number, holder, balance, withdrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			Double newWithdraw = sc.nextDouble();
			c.withdraw(newWithdraw);
			
			System.out.println("New balance: " + String.format("%.2f", c.getBalance()));
			
		} catch (WithdrawException e) {
			System.out.println("Withdraw Error: " + e.getMessage());
		} finally {
			sc.close();
		}
	}
}