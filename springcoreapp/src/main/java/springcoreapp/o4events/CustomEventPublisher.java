package springcoreapp.o4events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CustomEventPublisher {

	@Autowired
	private ApplicationEventPublisher publisher;

	public void publish() {
		CustomEvent event = new CustomEvent(this);
		publisher.publishEvent(event);
	}

}
