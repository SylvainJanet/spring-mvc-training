package springcoreapp.o2ioc;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public class Question implements Serializable {
	private static final long serialVersionUID = -5765708267380099199L;
	private long id;
	private String name;
	private List<String> answers;

	public Question() {
	}

	public Question(long id, String name, List<String> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println(id + " " + name);
		System.out.println("answers are:");
		Iterator<String> itr = answers.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
