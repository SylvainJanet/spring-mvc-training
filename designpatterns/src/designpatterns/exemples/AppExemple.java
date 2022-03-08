package designpatterns.exemples;

public class AppExemple {
	
	public static void main(String[] args) {
		Pdg pdg = Pdg.getInstance();
		
		pdg.setName("Micka");
		pdg.setAge(42);
		
		System.out.println("Le pdg : " + pdg);
		
		// ....
		
		Pdg samePdg = Pdg.getInstance();
		
		System.out.println("Le pdg à nouveau : " + samePdg);
		
		System.out.println("pdg == samePdg : " + (pdg == samePdg));
		
		System.out.println("_____");
		
		Product p = new Product("PC",1500);
		
		Customer c1 = new Customer("Sylvain");
		Customer c2 = new Customer("Denis");
		
		p.attach(c1);
		p.attach(c2);
		
		p.setPrice(1099.99);
	}
}
