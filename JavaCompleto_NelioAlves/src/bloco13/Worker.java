package bloco13;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
	
	// atributos
	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	// associações
	
	private WorkerDepartment department;
	private List<WorkerHourContract> contracts = new ArrayList<>();
	// composição "tem muitos" nao inclui no construtor, logo, sao iniciadas vazias
	
	public Worker() {
		
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, WorkerDepartment department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public WorkerDepartment getDepartment() {
		return department;
	}

	public void setDepartment(WorkerDepartment department) {
		this.department = department;
	}

	public List<WorkerHourContract> getContracts() {
		return contracts;
	}
	
	public void addContract(WorkerHourContract contract) {
		this.contracts.add(contract);
	}

	public void removeContract(WorkerHourContract contract) {
		this.contracts.remove(contract);
	}
	
	public Double income(Integer year, Integer month) {
		Double sum = this.baseSalary;
		Calendar cal = Calendar.getInstance();
		
		for (WorkerHourContract c : contracts) {
			
			cal.setTime(c.getDate());
			Integer c_year = cal.get(Calendar.YEAR);
			Integer c_month = 1 + cal.get(Calendar.MONTH);
			
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}