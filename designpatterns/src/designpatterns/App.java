package designpatterns;

public class App {

	public static void main(String[] args) {
		System.out.println("Début du programme");
		
		System.out.println("Première récupération du singleton");
		MySingleton singleton = MySingleton.getInstance();
		
		singleton.setField("Une valeur");
		
		System.out.println(singleton.toString());
		
		System.out.println("Deuxième récupération du singleton");
		MySingleton stillSingleton = MySingleton.getInstance();
		
		System.out.println(stillSingleton.toString());
		
		System.out.println("singleton == stillSingleton : " + (singleton == stillSingleton));
		
		System.out.println("Encore une autre récupération du singleton");
		MySingleton alwaysSingleton = MySingleton.getInstance();
		
		System.out.println(alwaysSingleton.toString());
		
		System.out.println("singleton == alwaysSingleton : " + (singleton == alwaysSingleton));
	
		System.out.println("_____");
		
		MyPublisher myPublisher = new MyPublisher();
		MyListener myListener = new MyListener();
		
		myPublisher.attach(myListener);
		
		myPublisher.setExampleField("initial value");
		myPublisher.setExampleField("other value");
	
	}

}
