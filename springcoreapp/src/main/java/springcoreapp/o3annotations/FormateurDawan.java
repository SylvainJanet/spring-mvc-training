package springcoreapp.o3annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FormateurDawan extends Formateur {

	public FormateurDawan(@Value("Sylvain") String name) {
		this.setName(name);
	}

	@Override
	public void sePresenter() {
		System.out.println("Je suis " + this.getName() + ", formateur Dawan");

	}

}
