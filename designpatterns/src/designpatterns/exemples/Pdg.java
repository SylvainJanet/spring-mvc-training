package designpatterns.exemples;

public class Pdg {

	private String name;
	private int age;
	
	private static Pdg instance;
	
	private Pdg() {
		
	}
	
	public static Pdg getInstance() {
		if (instance == null) {
			instance = new Pdg();
		}
		return instance;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Pdg [name=" + name + ", age=" + age + "]";
	}
	
	
}
