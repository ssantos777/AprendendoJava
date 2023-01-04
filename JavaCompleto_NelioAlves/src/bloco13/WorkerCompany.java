package bloco13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class WorkerCompany {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		WorkerDepartment departamento = new WorkerDepartment(departmentName);
		
		System.out.println("Enter worker data.");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Level: ");
		WorkerLevel level = WorkerLevel.valueOf(sc.nextLine());
		
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(name, level, baseSalary, departamento);
		
		
		System.out.print("How many contracts to this worker? ");
		Integer contractsNumber = sc.nextInt();
		
		for(int i=1; i <= contractsNumber; i++) {
			
			System.out.println("Enter contract #" + i + " data:");
			
			System.out.print("Date (DD/MM/YYYY): ");
			Date date = sdf1.parse(sc.next());
			
			System.out.print("Value per hour: ");
			Double valueHour = sc.nextDouble();
			
			System.out.print("Duration (hours): ");
			Integer hours = sc.nextInt();
			
			WorkerHourContract contrato = new WorkerHourContract(date, valueHour, hours);
			worker.addContract(contrato);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		Integer year = Integer.parseInt(monthAndYear.substring(3));
		Integer month = Integer.parseInt(monthAndYear.substring(0,2));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.printf("Income for %d/%d: %.2f", month, year, worker.income(year, month));
		
		sc.close();
	}
}
