package designpatterns.exemples;

import java.util.Date;

public class PriceUpdateEvent {

	private double oldPrice;
	private double newPrice;
	private Date date;
	
	public PriceUpdateEvent(double oldPrice, double newPrice, Date date) {
		super();
		this.oldPrice = oldPrice;
		this.newPrice = newPrice;
		this.date = date;
	}

	public double getOldPrice() {
		return oldPrice;
	}

	public void setOldPrice(double oldPrice) {
		this.oldPrice = oldPrice;
	}

	public double getNewPrice() {
		return newPrice;
	}

	public void setNewPrice(double newPrice) {
		this.newPrice = newPrice;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
