package designpatterns;

public class MyListener implements Listener {

	@Override
	public void update(String oldValue, String newValue) {
		System.out.println("Value has been updated !");
		System.out.println("Old value : " + oldValue);
		System.out.println("New value : " + newValue);
		
	}

}
