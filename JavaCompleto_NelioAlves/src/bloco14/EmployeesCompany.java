package bloco14;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeesCompany {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		Integer employeesNumber = sc.nextInt();
		
		List<Employee> employeesList = new ArrayList<>();
		
		for (int i = 1; i <= employeesNumber; i++) {
			System.out.println("Employee #" + i + " data.");
			System.out.print("Outsourced (y/n)? ");
			char isOutsourced = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			if (isOutsourced == 'y' || isOutsourced == 'Y') { 
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				employeesList.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else { 
				employeesList.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println("PAYMENTS: ");
		for (Employee i: employeesList) {
			System.out.println(i.toString());
		}
		
		sc.close();
	}
}