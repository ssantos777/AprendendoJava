package bloco24;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

	private Integer number;
	private LocalDate contractDate;
	private Double totalValue;
	private List<Installment> installmentsList = new ArrayList<>();
	
	public Contract() {
		
	}

	public Contract(Integer number, LocalDate contractDate, Double totalValue) {
		this.number = number;
		this.contractDate = contractDate;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getContractDate() {
		return contractDate;
	}

	public void setContractDate(LocalDate contractDate) {
		this.contractDate = contractDate;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallmentsList() {
		return installmentsList;
	}

	public void addInstallment(Installment installment) {
		installmentsList.add(installment);
	}
	
	public void printInstallments() {
		for (Installment i: installmentsList) {
			System.out.println(i);
		}
	}
	
}