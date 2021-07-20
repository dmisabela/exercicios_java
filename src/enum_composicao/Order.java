package enum_composicao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	
	private Date moment;
	private OrderStatusEnum status;
	
	private Client client;
	
	private List<OrderItem> items = new ArrayList<>();
	
	public Order () {
		
	}

	public Order(Date moment, OrderStatusEnum status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatusEnum getStatus() {
		return status;
	}

	public void setStatus(OrderStatusEnum status) {
		this.status = status;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);		
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);		
	}
	
	public Double total() {		
		double soma = 0.0;
			for(OrderItem item : items) {
				soma += item.subTotal();
			}
		return soma;		
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder(); 
			
			for (OrderItem item : items) {
				sb.append(item + "\n");
			}
			sb.append("Total price: $");
			sb.append(String.format("%.2f", total()));
		
		return sb.toString();
	}
	
}
