package bloco24;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
	
	private LocalDate paymentDate;
	private Double value;
	
	public Installment() {
		
	}

	public Installment(LocalDate paymentDate, Double value) {
		this.paymentDate = paymentDate;
		this.value = value;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		StringBuilder sb = new StringBuilder();
		sb.append(paymentDate.format(formatter) + " - ");
		sb.append(String.format("%.2f", getValue()));
		return sb.toString();
	}
}