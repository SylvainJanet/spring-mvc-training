package springcoreapp.o3annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("center1")
public class Center {

	private String name;
	
	public Center(@Value("Dawan") String name) {
		this.name = name;
	}

	public String getName() {
//		System.out.println("getName - Center");
		return name;
	}

	public void setName(String name) {
//		System.out.println("setName - Center");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Center [name=" + name + "]";
	}

}
