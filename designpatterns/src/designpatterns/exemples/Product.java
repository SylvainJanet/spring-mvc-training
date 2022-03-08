package designpatterns.exemples;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Product implements EventPublisher<PriceUpdateEvent> {

	private String description;
	private double price;

	private List<EventListener<PriceUpdateEvent>> listeners;

	public Product() {
		super();
		listeners = new ArrayList<>();
	}

	public Product(String description, double price) {
		super();
		this.description = description;
		this.price = price;
		listeners = new ArrayList<>();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		PriceUpdateEvent event = new PriceUpdateEvent(this.price, price, new Date());
		this.price = price;
		this.notifyListeners(event);
	}

	@Override
	public void attach(EventListener<PriceUpdateEvent> l) {
		if (!listeners.contains(l)) {
			listeners.add(l);
		}

	}

	@Override
	public void detach(EventListener<PriceUpdateEvent> l) {
		listeners.remove(l);

	}

	@Override
	public void notifyListeners(PriceUpdateEvent event) {
		for (EventListener<PriceUpdateEvent> listener : listeners) {
			listener.udpate(event);
		}

	}

}
