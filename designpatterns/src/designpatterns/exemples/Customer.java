package designpatterns.exemples;

public class Customer implements EventListener<PriceUpdateEvent> {

	private String name;

	public Customer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void udpate(PriceUpdateEvent event) {
		System.out.println("Customer " + name + " has been notified of the price change");
		System.out.println("Old price : " + event.getOldPrice());
		System.out.println("New price : " + event.getNewPrice());
		System.out.println("Date of change : " + event.getDate());
		
	}

}
