package springcoreapp.o2ioc;

import java.io.Serializable;

public class Answer implements Serializable {

	private static final long serialVersionUID = -627288807268198435L;
	private long id;
	private String name;
	private String by;

	public Answer() {
	}

	public Answer(long id, String name, String by) {
		super();
		this.id = id;
		this.name = name;
		this.by = by;
	}

	public String toString() {
		return id + " " + name + " " + by;
	}
}
