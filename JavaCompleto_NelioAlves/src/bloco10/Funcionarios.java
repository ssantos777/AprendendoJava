package bloco10;

public class Funcionarios {
	private int id;
	private String name;
	private double salary;

	public Funcionarios(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary; // nao sei como usar increaseSalary aqui
	}

	public int getId() {
		return id;
	}

	public void setId(int id) { // talvez private
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void increaseSalary(float percentage) {
		salary += salary*(percentage/100);
	}
	
	public String toString() {
		return id +
				", " +
				name +
				", " +
			String.format("%.2f", salary);
	}

}
