package springcoreapp.o2ioc;

import java.io.Serializable;

public class Citoyen implements Serializable{

	private static final long serialVersionUID = -7744168616553979386L;
	private long id;
	private String name;
	private Address address;
	public Citoyen() {
		super();
	}
	public Citoyen(long id, String name) {
		super();
		this.id=id;
		this.name=name;
	}
	public Citoyen(long id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void show() {
		System.out.println(id + " : " + name + " - " + address);
	}

}
