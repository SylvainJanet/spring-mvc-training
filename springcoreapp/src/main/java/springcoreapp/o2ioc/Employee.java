package springcoreapp.o2ioc;

import java.io.Serializable;

public class Employee implements Serializable{

	private static final long serialVersionUID = 3134737147014797690L;
	private long id;
	private String name;
	
	public Employee() {
		super();
		System.out.println("Constructeur de Employee sans paramètres");
	}
	public Employee(long id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("Constructeur de Employee avec 2 params");
	}
	public Employee(long id) {
		super();
		this.id = id;
		System.out.println("Constructeur de Employee avec 1 param : id");
	}
	public Employee(String name) {
		super();
		this.name = name;
		System.out.println("Constructeur de Employee avec 1 param : name");
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	
	public void show() {
		System.out.println(id + " : " + name);
	}
}
