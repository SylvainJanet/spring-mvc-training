package springcoreapp.o2ioc;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public class QuestionListAnswer implements Serializable {

	private static final long serialVersionUID = 3715622792952887882L;
	private long id;
	private String name;
	private List<Answer> answers;

	public QuestionListAnswer() {
	}

	public QuestionListAnswer(long id, String name, List<Answer> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println(id + " " + name);
		System.out.println("answers are:");
		Iterator<Answer> itr = answers.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}