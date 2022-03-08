package springcoreapp.o3annotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ResourceBundleMessageSource;

import springcoreapp.o2ioc.Address;
import springcoreapp.o2ioc.Answer;
import springcoreapp.o2ioc.Citoyen;
import springcoreapp.o2ioc.Employee;
import springcoreapp.o2ioc.Question;
import springcoreapp.o2ioc.QuestionListAnswer;
import springcoreapp.o2ioc.Student;

@Configuration
@ComponentScan("springcoreapp.o3annotations")
@PropertySource("config.properties")
public class AppConfiguration {

	// je peux définir des méthodes pour créer des Beans en utilisant
	// l'annotation @Bean
	// le nom de la méthode sera l'id du Bean
	@Bean
	public Student studentBean2() {
		Student res = new Student();
		res.setStudentName("Edgar");
		return res;
	}

	@Bean
	public Employee employee() {
		return new Employee(12, "Gael");
	}

	@Bean
	public Address addressBean() {
		return new Address("Ville", "Region", "Pays");
	}

	@Bean
	public Citoyen citizen() {
		return new Citoyen(19, "Joshua", addressBean());
	}

	@Bean
	public Question question() {
		return new Question(111, "What is java ?",
				new ArrayList<String>(Arrays.asList("Réponse 1", "Réponse 2", "Réponse 3")));
	}

	@Bean
	public Answer answer1() {
		return new Answer(1, "Réponse un", "Truc");
	}

	@Bean
	public Answer answer2() {
		return new Answer(2, "Réponse deux", "Machin");
	}

	@Bean
	public QuestionListAnswer question2() {
		List<Answer> reponses = new ArrayList<Answer>(Arrays.asList(answer1(), answer2()));
		return new QuestionListAnswer(67, "What is Java", reponses);
	}

	private Citoyen getCitoyenParent() {
		return new Citoyen(18, "Valentin");
	}

	@Bean
	public Citoyen citoyenbis() {
		return getCitoyenParent();
	}

	@Bean
	public Address address2() {
		return new Address("Truc", "Bidule", "Ailleurs");
	}

	@Bean
	public Citoyen citoyen2() {
		Citoyen c = getCitoyenParent();
		c.setAddress(address2());
		return c;
	}

	@Bean(initMethod = "myInitMethod", destroyMethod = "myDestroyMethod")
	public Student studentBySetter() {
		Student res = new Student();
		res.setStudentName("Quentin");
		return res;
	}

	@Bean
	@Scope("singleton")
	public Student studentSingleton() {
		return new Student("Je suis un singleton");
	}

	@Bean
	@Scope("prototype")
	public Student studentPrototype() {
		return new Student("Je suis un prototype");
	}

	@Bean
	public Center center2() {
		Center res = new Center("Center 2");
		return res;
	}

	@Bean
	public Center center3() {
		Center res = new Center("Center 3");
		return res;
	}

	@Bean
	public ResourceBundleMessageSource messageSource() {
		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		
		source.setBasename("valeurs");
		source.setUseCodeAsDefaultMessage(true);
		
		return source;
	}

}
