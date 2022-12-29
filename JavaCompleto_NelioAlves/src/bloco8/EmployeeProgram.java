package bloco8;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeProgram {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		Employee e1 = new Employee();
		
		System.out.print("Name: ");
		e1.name = sc.nextLine();
		System.out.print("Gross salary: ");
		e1.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		e1.tax = sc.nextDouble();
		
		System.out.println("Employee: " + e1);
		
		System.out.print("Which percentage to increase salary? ");
		e1.increaseSalary(sc.nextDouble());
		
		System.out.println("Updated data: " + e1);
		
		sc.close();
	}
}
