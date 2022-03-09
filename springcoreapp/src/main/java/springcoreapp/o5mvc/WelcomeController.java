package springcoreapp.o5mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {

	@RequestMapping(value = "/first", method = RequestMethod.GET)
	public String welcome(Model model) {
		model.addAttribute("message", "Hello world ! Première page grâce à Spring MVC (firstPage.jsp, message généré depuis le controleur)");
		return "firstPage";
	}
}
