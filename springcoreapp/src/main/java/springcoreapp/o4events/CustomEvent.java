package springcoreapp.o4events;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

	private static final long serialVersionUID = 4016116813951570649L;

	public CustomEvent(Object source) {
		super(source);
	}

	public String toString() {
		return "L'évènement custom s'est produit";
	}
	

}
