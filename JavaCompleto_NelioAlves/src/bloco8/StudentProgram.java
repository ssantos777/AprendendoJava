package bloco8;

import java.util.Locale;
import java.util.Scanner;

public class StudentProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		Student s1 = new Student();

		s1.name = sc.nextLine();
		s1.grade1 = sc.nextDouble();
		s1.grade2 = sc.nextDouble();
		s1.grade3 = sc.nextDouble();
		s1.finalGrade();
		s1.passFailed();
		
		sc.close();
	}
}