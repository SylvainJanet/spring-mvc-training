package springcoreapp.o2ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {

	public static void main(String[] args) {
		// Créer le contexte
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		System.out.println("_____ IOC _____");

		Student student = context.getBean("studentbean", Student.class);
		student.displayInfo();

		System.out.println("_____ Injection par constructeur _____");

		Employee employee = context.getBean("employee", Employee.class);
		employee.show();

		System.out.println("_____ Injection par constructeur avec une dépendance Bean _____");

		Citoyen citoyen = context.getBean("citoyen", Citoyen.class);
		citoyen.show();

		System.out.println("_____ Injection par constructeur avec une collection (List) _____");
		Question question = context.getBean("question", Question.class);
		question.displayInfo();

		System.out.println("_____ Injection par constructeur avec une collection (List) de Bean _____");
		QuestionListAnswer question2 = context.getBean("question2", QuestionListAnswer.class);
		question2.displayInfo();

		System.out.println("_____ Injection par constructeur avec une collection (Map)");
		QuestionMap question3 = context.getBean("question3", QuestionMap.class);
		question3.displayInfo();

		System.out.println("_____ Injection par constructeur avec une collection (Map) de Bean _____");
		QuestionMapUser question4 = context.getBean("question4", QuestionMapUser.class);
		question4.displayInfo();

		System.out.println("_____ Héritage de beans _____");
//		Citoyen citoyen2 = context.getBean("citoyen2", Citoyen.class);
		Citoyen citoyen3 = context.getBean("citoyen3", Citoyen.class);

//		citoyen2.show();
		citoyen3.show();

		System.out.println("_____ Injection par setter _____");
		Student student2 = context.getBean("otherstudent", Student.class);
		student2.displayInfo();

		// Le conteneur Spring utilise l'injection par constructeur d'abbord
		// puis injecte les valeurs par setters
		// Si la même propriété est injectée par deux méthodes, c'est en finalité
		// l'injection par setter qui sera effective
		
		System.out.println("_____ Scopes des beans _____");
		
		// Spring permet de définir des beans qui peuvent avoir différentes portées
		// (scopes). Par défaut, il s'agit de singleton
		
		// Scopes possibles :
		// Singleton : une unique instance est créée, et on récupère toujours le 
		// même objet
		// Prototype : à chaque fois qu'on essaye de le récupérer depuis le contexte,
		// une nouvelle instance est créée
		// request : lié à une requête HTTP
		// session : lié à une session
		// application, websocket (on en parlera pas, mais lié aux appli web)

		Student otherstudent = context.getBean("otherstudent",Student.class);
		Student studentSingleton = context.getBean("otherstudent",Student.class);
		
		otherstudent.displayInfo();
		otherstudent.setStudentName("singleton edité");
		otherstudent.displayInfo();
		
		
		studentSingleton.displayInfo();
		
		System.out.println("_____");
		
		Student prototype = context.getBean("studentprototype",Student.class);
		Student otherPrototype = context.getBean("studentprototype",Student.class);
		
		prototype.displayInfo();
		prototype.setStudentName("prototype edité");
		prototype.displayInfo();
		
		
		otherPrototype.displayInfo();
		
		// Cycle de vie des beans : 
		// Bean instancié -> dépendances injectées -> 
		//						Méthodes Init et Destroy définies et peuvent être appelées -> Bean est prêt
		
		System.out.println("_____ Autowiring _____");
		 
		// Permet d'injecter des dépendances de manière implicite
		// (même si en toute finalité Spring utilise soit une injection par constructeur
		// soit une injection par setter)
		
		// avantage : on a pas besoin de spécifier nous même l'injection
		// inconvénient : on perd en contrôle
		
		// modes d'autowiring :
		// no : pas d'autowiring, le choix par défaut
		// byName : cherche un bean qui a le même nom que la propriété qu'on souhaite injecter
		// 			injection par setter
		// byType : cherche un bean qui a le bon type. On doit spécifier les beans qui sont à rejeter
		// 			puisque Spring ne peut pas choisir entre plusieurs beans du bon type
		//			injection par setter
		// constructor : appelle le constructeur de la classe ayant le plus grand nombre de paramètres
		// autodetect : déprécié
		
		Citoyen citoyenByName = context.getBean("citoyenByName", Citoyen.class);
		citoyenByName.show();
		
		Citoyen citoyenByType = context.getBean("citoyenByType",Citoyen.class);
		citoyenByType.show();
		
		((ClassPathXmlApplicationContext) context).close();
		
		
	}

}