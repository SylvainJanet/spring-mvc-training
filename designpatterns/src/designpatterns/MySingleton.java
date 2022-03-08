package designpatterns;

public class MySingleton {

	private String field;
	
	private static MySingleton instance;
	
	private MySingleton() {
		System.out.println("Instanciation");
	}
	
	public static MySingleton getInstance() {
		if (instance == null) {
			instance = new MySingleton();
		}
		return instance;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
	
	@Override
	public String toString() {
		return "MySingleton [field=" + field + "]";
	}
	
}
