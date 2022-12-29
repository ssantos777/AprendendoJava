package bloco8;

public class Employee {
	public String name;
	public double grossSalary, tax;
	
	public double netSalary() {
		return this.grossSalary - this.tax;
	}
	
	public void increaseSalary(double percentage) {
		this.grossSalary += this.grossSalary*(percentage/100);
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
}
