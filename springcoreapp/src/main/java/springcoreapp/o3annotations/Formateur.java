package springcoreapp.o3annotations;

public abstract class Formateur implements IFormateur {
	
	private String name;

	public String getName() {
//		System.out.println("getName - Formateur");
		return name;
	}

	public void setName(String name) {
//		System.out.println("setName - Formateur");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Formateur [name=" + name + "]";
	}

}
