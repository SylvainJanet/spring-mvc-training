package springcoreapp.o3annotations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Formation {

	@Value("Formation Spring MVC")
	private String title;

	// Ajoute le Bean Centre byType
	@Autowired
	@Qualifier("center2")
	private Center center;

	// Ajoute tous les Beans disponibles du type adapté
	@Autowired
	private List<IFormateur> formateurs;

	// Ajoute les paires (id du bean, bean) pour tous les beans du type adapté
	@Autowired
	private Map<String, IFormateur> formateursMap;

	public Formation() {
		formateurs = new ArrayList<IFormateur>();
		formateursMap = new HashMap<String, IFormateur>();
	}

	public String getTitle() {
//		System.out.println("getTitle - Formation");
		return title;
	}

	public void setTitle(String title) {
//		System.out.println("setTitle - Formation");
		this.title = title;
	}

	public Center getCenter() {
		return center;
	}

	public void setCenter(Center center) {
		this.center = center;
	}

	public List<IFormateur> getFormateurs() {
		return formateurs;
	}

	public void setFormateurs(List<IFormateur> formateurs) {
		this.formateurs = formateurs;
	}

	public Map<String, IFormateur> getFormateursMap() {
		return formateursMap;
	}

	public void setFormateursMap(Map<String, IFormateur> formateursMap) {
		this.formateursMap = formateursMap;
	}

	public void display() {
		System.out.println("Formation : " + this.title);
		System.out.println("Center : " + this.center);
		System.out.println("Formateurs : ");
		for (IFormateur formateur : formateurs) {
			formateur.sePresenter();
		}
		System.out.println("_____");
		System.out.println("Formateurs Map :");
		for (Entry<String, IFormateur> entry : formateursMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue().toString());
		}
	}

}
