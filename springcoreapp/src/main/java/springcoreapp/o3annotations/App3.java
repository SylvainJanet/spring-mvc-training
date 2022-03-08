package springcoreapp.o3annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springcoreapp.o2ioc.Citoyen;
import springcoreapp.o2ioc.Employee;
import springcoreapp.o2ioc.Question;
import springcoreapp.o2ioc.QuestionListAnswer;
import springcoreapp.o2ioc.Student;

public class App3 {

	public static void main(String[] args) {

		// Pour faire une configuration à la fois par annotations et par xml
		ApplicationContext context = new ClassPathXmlApplicationContext("contextAnnotations.xml");

		System.out.println("_____ IOC _____");
		StudentAnnotated student = context.getBean("studentBean", StudentAnnotated.class);
		student.displayInfo();

		((ClassPathXmlApplicationContext) context).close();
		System.out.println("_____ Configuration Java _____");

		context = new AnnotationConfigApplicationContext(AppConfiguration.class);

//		// on peut aussi instancier le contexte :
//		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext();
//		// puis le configurer en ajoutant des fichiers de configuration :
//		context2.register(AppConfiguration.class);
//		context2.register(AutreFichierDeConfig.class);
//		context2.close();

		StudentAnnotated student2 = context.getBean("studentBean", StudentAnnotated.class);
		student2.displayInfo();

		Student student3 = context.getBean("studentBean2", Student.class);
		student3.displayInfo();

		System.out.println("_____ Injection par constructeur _____");

		Employee emp = context.getBean("employee", Employee.class);
		emp.show();

		System.out.println("_____ Injection par constructeur de Bean _____");

		Citoyen citoyen = context.getBean("citizen", Citoyen.class);
		citoyen.show();

		System.out.println("_____ Injection par construceur avec une collection (List) _____");

		Question question = context.getBean("question", Question.class);
		question.displayInfo();

		System.out.println("_____ Injection par constructeur avec une collection (List) de Beans _____");

		QuestionListAnswer question2 = context.getBean("question2", QuestionListAnswer.class);
		question2.displayInfo();
		
		System.out.println("_____ Injection par constructeur avec une collection (Map) éventuellement de beans _____");
		System.out.println("Même principe");
		
		System.out.println("_____ Héritage de Beans _____");
		
		Citoyen citoyenbis = context.getBean("citoyenbis",Citoyen.class);
		citoyenbis.show();
		
		Citoyen citoyen2 = context.getBean("citoyen2", Citoyen.class);
		citoyen2.show();
		
		System.out.println("_____ Injection par setteur _____");
		
		Student myStudentBySetterVariable = context.getBean("studentBySetter",Student.class);
		myStudentBySetterVariable.displayInfo();
		
		System.out.println("_____ Scopes _____");
		
		Student singleton = context.getBean("studentSingleton",Student.class);
		singleton.displayInfo();
		singleton.setStudentName("Singleton edited");
		singleton.displayInfo();
		
		Student otherSingleton = context.getBean("studentSingleton",Student.class);
		otherSingleton.displayInfo();
		
		System.out.println("_____");
		
		Student prototype = context.getBean("studentPrototype",Student.class);
		prototype.displayInfo();
		prototype.setStudentName("Prototype edited");
		prototype.displayInfo();
		
		Student otherPrototype = context.getBean("studentPrototype", Student.class);
		otherPrototype.displayInfo();
		
		System.out.println("_____ Autowiring _____");
		
		Formateur fDawan = context.getBean("formateurDawan",FormateurDawan.class);
		Formateur fExterne = context.getBean("formateurExterne", FormateurExterne.class);
		
		fDawan.sePresenter();
		fExterne.sePresenter();
		
		System.out.println("_____");
		
		Center center = context.getBean("center1",Center.class);
		System.out.println("Center : " + center);
		
		System.out.println("_____");
		
		Formation formationSpringMvc = context.getBean("formation",Formation.class);
		formationSpringMvc.display();
		
		// byName : selon le nom de la propriété
		// byType : selon le type
		// si on ne spécifie rien, l'annotation autowired fonctionne byType
		
		// que se passe-t-il si on autowired une liste ou une map ?
		
		System.out.println("_____");
		
		Center center2 = context.getBean("center2",Center.class);
		Center center3 = context.getBean("center3",Center.class);
		
		System.out.println("Center2 : " + center2);
		System.out.println("Center3 : " + center3);
		
		// l'injection par setter se fait en dernier
		
		System.out.println("_____");
		
		International international = context.getBean("international",International.class);
		System.out.println(international);
		
		((AnnotationConfigApplicationContext) context).close();
	}

}
