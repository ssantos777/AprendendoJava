package bloco10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Empresa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Integer> listaIds = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int employeesToRegist = sc.nextInt();
		
		Funcionarios[] vectFuncs = new Funcionarios[employeesToRegist];
		
		for(int i = 0; i < vectFuncs.length; i++) {
			System.out.printf("Employee #%d:%n", i + 1);
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			vectFuncs[i] = new Funcionarios(id, name, salary);
			listaIds.add(id);
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idIncreaseSalary = sc.nextInt();
		
		int isInVect = listaIds.indexOf(idIncreaseSalary);
				
		if (isInVect != -1) {
			
			System.out.print("Enter the percentage: ");
			float percentage = sc.nextFloat();
			vectFuncs[isInVect].increaseSalary(percentage);
			
		} else {
			System.out.println("This id does not exist!");
		}
		
		System.out.println("List of Employees: ");
		
		for (Funcionarios obj : vectFuncs) {
			System.out.println(obj.toString());
		}
		
		sc.close();
		
	}
}