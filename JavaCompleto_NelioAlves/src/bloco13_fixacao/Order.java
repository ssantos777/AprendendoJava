package bloco13_fixacao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrderItem> orders = new ArrayList<>();
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client client) {
		setMoment(moment);
		setStatus(status);
		setClient(client);
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrders() {
		return orders;
	}

	public void addItem(OrderItem item) {
		this.orders.add(item);
	}
	
	public void removeItem(OrderItem item) {
		this.orders.remove(item);
	}
	
	public Double total() {
		Double sum = 0.0;
		
		for (OrderItem i: orders) {
			sum += i.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: " + getMoment() + "\n");
		sb.append("Order status: " + getStatus() + "\n");
		sb.append("Client: " + getClient().getName() + " (" + sdf.format(getClient().getBirthDate()) + ") - " + getClient().getEmail() + "\n");
		sb.append("Order items: \n");
		for (OrderItem i: orders) {
			sb.append(i.toString() + "\n");
		}
		sb.append("Total price: $" + String.format("%.2f", total()) + "\n");
		
		return sb.toString();
	}
}