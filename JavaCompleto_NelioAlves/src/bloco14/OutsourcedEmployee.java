package bloco14;

public final class OutsourcedEmployee extends Employee {

	private static Double bonusPercentage = 1.1;
	
	private Double additionalCharge;
	
	public OutsourcedEmployee () {
		super();
	}
	
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public Double payment() {
		return super.payment() + (additionalCharge * bonusPercentage);
		
	}
	
	@Override
	public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(name + " - $" + String.format("%.2f", payment()));
			return sb.toString();
	}
}