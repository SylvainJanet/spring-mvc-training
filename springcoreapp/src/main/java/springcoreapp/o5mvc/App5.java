package springcoreapp.o5mvc;

public class App5 {

	public static void main(String[] args) {
		// Servlet : un programme qui s'exécute côté serveur
		
		// Modèle MVC : 
		// https://jmdoudoux.developpez.com/cours/developpons/java/images/framework001.png
		// chaque requête est traitée par un contrôleur (un servlet) qui fait appel aux éléments du modèle si nécéssaire et qui redirige la requête
		// vers la page .jsp
		
		// Spring MVC utilise le modèle MVC2 :
		// https://jmdoudoux.developpez.com/cours/developpons/java/images/framework002.png
		// Une unique servlet fait office de contrôleur et gère toutes les requêtes
		// on centralise la configuration de tous les controleurs (du point MVC 1) dans un contrôleur.
		
		// Il utilise plusieurs Beans :
		// https://miro.medium.com/max/1400/1*pF9_UCZUWQH97PVMpB0PzA.png
		// DispatcherServlet : gère les requêtes HTTP et les réponses
		// HandlerMapping : renseigne le contrôleur à utiliser
		// Contrôleur : effectue le traitement en utilisant le modèle si besoin, et renvoie la vue à afficher et éventuellement des données
		// ViewResolver : injecte les données dans la vue
		// View : la page jsp à afficher
		

	}

}
