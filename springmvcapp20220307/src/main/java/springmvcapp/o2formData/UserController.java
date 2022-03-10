package springmvcapp.o2formData;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

	@GetMapping("")
	public String formUser(Model model) {
		model.addAttribute("user", new User());
		return "formDataPage";
	}

	@PostMapping("/addUser")
	public String addUser(@Valid @ModelAttribute(name = "user") User user, BindingResult results, Model model) {

		if (results.hasErrors()) {
			model.addAttribute("user", user);
			return "formDataPage";
		}
		model.addAttribute("message", "User : " + user.getId() + " - " + user.getName());
		return "firstPage";
	}

	@GetMapping("/show")
	public String showUser(@RequestParam("id") long id, @RequestParam("name") String name, Model model) {
		model.addAttribute("user", new User(id, name));
		return "formDataPage";
	}
}
