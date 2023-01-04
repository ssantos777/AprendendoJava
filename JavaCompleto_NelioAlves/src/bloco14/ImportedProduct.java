package bloco14;

public final class ImportedProduct extends Product {

	private Double customsFee;
	
	public ImportedProduct () {
		
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName() + " $ " + String.format("%.2f", getPrice()));
		sb.append(" (Customs Fee: $ " + String.format("%.2f", getCustomsFee()) + ")");
		return sb.toString();
	}	
}