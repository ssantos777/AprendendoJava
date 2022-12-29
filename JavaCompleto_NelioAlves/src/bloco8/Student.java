package bloco8;

public class Student {
	public String name;
	public double grade1, grade2, grade3, nota, missing;
	
	public void finalGrade() {
		// nota = ((grade1*10) + (grade2*10) + (grade3*10)) / 10;
		nota = grade1 + grade2 + grade3;
		System.out.println("FINAL GRADE = " + String.format("%.2f", nota));
	}
	
	public void passFailed() {
		if (nota < 60.00) {
			System.out.println("FAILED");
			missing = 60 - nota;
			System.out.println("MISSING "  + String.format("%.2f", missing) + " POINTS");
		} else {
			System.out.println("PASS");
		}
	}
	
	
}
