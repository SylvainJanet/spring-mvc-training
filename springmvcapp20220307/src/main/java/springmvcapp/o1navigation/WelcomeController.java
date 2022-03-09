package springmvcapp.o1navigation;

import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("")
public class WelcomeController {

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String welcome(Model model, Locale locale) {
		model.addAttribute("message", "Hello Spring MVC Framework ! Locale : " + locale);
		return "firstPage";
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String redirectHello() {
		return "helloPage";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String redirectHome() {
		return "forward:/app/";
	}

	@RequestMapping(value = "/modelUse", method = RequestMethod.GET)
	public String moduleUse() {
		return "modelUsePage";
	}

	@RequestMapping(value = "/submitModelUse", method = RequestMethod.POST)
	public String submitModelUsePage(@RequestParam("name") String name, @RequestParam("pass") String password,
			Model model) {
		String message;
		if (password.equals("admin")) {
			message = "Hello " + name;
		} else {
			message = "Sorry " + name + ". You entered an incorrect password";
		}
		model.addAttribute("message", message);
		return "firstPage";

	}

	@GetMapping(value = "/submitModelUsePage")
	public String submitModelUsePageRedirect() {
		return "redirect:/app/modelUse";

	}

	// Forward : conserve la requête mais l'envoie à une autre servlet
	// Redirect : fait une nouvelle requête à la nouvelle servlet

	@GetMapping(value = "/pathVariable")
	public String pathVariable() {
		return "pathVariablePage";
	}

	// on peut appliquer un patter (une regexp) à une pathVariable
	@GetMapping(value = "/pathVariable/exemple1/{word}/{number:[0-9]}")
	public String exemple1(@PathVariable("word") String word, @PathVariable("number") String nbr, Model model) {

		model.addAttribute("messageFromVariables", word + " - " + nbr);
		return "pathVariablePage";
	}

	@GetMapping(value = "/pathVariable/exemple2/{word}/truc/{number1:[0-9]}/{number2:[0-9]}")
	public String exemple2(@PathVariable Map<String, String> varsMap, Model model) {

		String msg = "";
		int i = 0;
		for (Entry<String, String> entry : varsMap.entrySet()) {
			msg += entry.getKey() + " - " + entry.getValue();
			i++;
			if (i != varsMap.size()) {
				msg += " | ";
			}
		}
		// key - value | key - value | key - value

		model.addAttribute("messageFromVariables", msg);
		return "pathVariablePage";
	}
	
	@GetMapping(value = "/langage")
	public String langagePage() {
		return "langagePage";
	}

}
