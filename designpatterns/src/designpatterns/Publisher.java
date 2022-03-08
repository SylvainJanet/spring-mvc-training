package designpatterns;

public interface Publisher {

	void attach(Listener l);
	
	void dettach(Listener l);
	
	void notifyListeners(String oldValue, String newValue);
}
