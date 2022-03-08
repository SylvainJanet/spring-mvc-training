package springcoreapp.o3annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

// @Component pour créer un bean instance de cette classe
// en paramètre : l'id du bean
// si rien n'est précisé, l'id par défaut est le nom de la classe
// en camelCase : StudentAnnotated -> studentAnnotated
// PascalCase : CeciEstMaVariable
// camelCase : ceciEstMaVariable

// exception : si le nom commence par plusieurs lettres majuscules
// classe : RESTController -> id du bean : RESTController
@Component("studentBean")
public class StudentAnnotated {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void displayInfo() {
		System.out.println("Hello ! My name is " + name);
	}
	
	@PostConstruct
	public void myInitMethod() {
		System.out.println("(annotated) initialisation");
	}
	
	@PreDestroy
	public void myDestroyMethod() {
		System.out.println("(annotated) bean destroyed");
	}
}
