package springcoreapp.o4events;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App4 {

	public static void main(String[] args) {
		// les évenements en Spring héritent de la classe ApplicationEvent

		// les évenements sont émis par un ApplicationEventPublisher

		// pour écouter un évènement de type TEvent, il faut implémenter l'interface
		// ApplicationListener<TEvent>

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfigurationEvents.class);
		
		context.start();
		context.stop();
		
		CustomEventPublisher publisher = context.getBean("customEventPublisher", CustomEventPublisher.class);
		publisher.publish();
		
		context.close();

	}

}
