package springcoreapp.o2ioc;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class QuestionMap {
	private long id;
	private String name;
	private Map<String, String> answers;

	public QuestionMap() {
	}

	public QuestionMap(long id, String name, Map<String, String> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println("question id:" + id);
		System.out.println("question name:" + name);
		System.out.println("Answers....");
		Set<Entry<String, String>> set = answers.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<String, String> entry = itr.next();
			String ans = entry.getKey();
			String user = entry.getValue();
			System.out.println("Answer Information:");
			System.out.println(ans);
			System.out.println("Posted By:");
			System.out.println(user);
		}
	}
}