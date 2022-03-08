package designpatterns;

import java.util.ArrayList;
import java.util.List;

public class MyPublisher implements Publisher {
	
	private String exampleField;

	private List<Listener> listeners;
	
	public MyPublisher() {
		listeners = new ArrayList<Listener>();
	}

	public String getExampleField() {
		return exampleField;
	}

	public void setExampleField(String exampleField) {
		String oldValue = this.exampleField;
		String newValue = exampleField;
		this.exampleField = exampleField;
		notifyListeners(oldValue, newValue);
	}

	@Override
	public void attach(Listener l) {
		if (!listeners.contains(l)) {
			listeners.add(l);
		}

	}

	@Override
	public void dettach(Listener l) {
		listeners.remove(l);
	}

	@Override
	public void notifyListeners(String oldValue, String newValue) {
		for (Listener l : listeners) {
			l.update(oldValue, newValue);
		}
	}

}
