package springcoreapp.o2ioc;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class QuestionMapUser implements Serializable {

	private static final long serialVersionUID = -7398951340856471558L;
	private long id;
	private String name;
	private Map<String, User> answers;

	public QuestionMapUser() {
	}

	public QuestionMapUser(long id, String name, Map<String, User> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println("question id:" + id);
		System.out.println("question name:" + name);
		System.out.println("Answers....");
		Set<Entry<String, User>> set = answers.entrySet();
		Iterator<Entry<String, User>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<String, User> entry = itr.next();
			String ans = entry.getKey();
			User user = entry.getValue();
			System.out.println("Answer Information:");
			System.out.println(ans);
			System.out.println("Posted By:");
			System.out.println(user);
		}
	}
}
