package bloco13_fixacao;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	
	private Product product;
	
	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, Product product) {
		setQuantity(quantity);
		setPrice(product.getPrice());
		setProduct(product);
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Double subTotal() {
		return price * quantity; 
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getProduct().getName());
		sb.append(", $" + String.format("%.2f", getProduct().getPrice()));
		sb.append(", Quantity: " + getQuantity());
		sb.append(", Subtotal: $" + String.format("%.2f", subTotal()));
		
		return sb.toString();
	}
}