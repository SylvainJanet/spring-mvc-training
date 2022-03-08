package designpatterns.exemples;

public interface EventPublisher<TEvent> {
	void attach(EventListener<TEvent> l);
	void detach(EventListener<TEvent> l);
	void notifyListeners(TEvent event);
}
