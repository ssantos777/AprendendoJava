package bloco13;

import java.util.Date;

public class WorkerHourContract {
	private Date date;
	private Double valuePerHours;
	private Integer hours;

	public WorkerHourContract() {
	
	}
	
	public WorkerHourContract(Date date, Double valuePerHours, Integer hours) {
		setDate(date);
		setValuePerHours(valuePerHours);
		setHours(hours);
	}
	
	public Double totalValue() {
		return valuePerHours * hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHours() {
		return valuePerHours;
	}

	public void setValuePerHours(Double valuePerHours) {
		this.valuePerHours = valuePerHours;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	
}
