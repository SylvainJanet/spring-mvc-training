package springcoreapp.o2ioc;

import java.io.Serializable;

public class User implements Serializable{

	private static final long serialVersionUID = -850459076835616077L;
	private long id;
	private String name, email;

	public User() {
	}

	public User(long id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public String toString() {
		return "Id:" + id + " Name:" + name + " Email Id:" + email;
	}
}
