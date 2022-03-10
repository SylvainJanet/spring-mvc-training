package springmvcapp.o3interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/login")
@SessionAttributes("userInfo")
public class LoginController {

	@ModelAttribute
	public UserInfo getUserInfo() {
		return new UserInfo();
	}

	@GetMapping("")
	public String login(Model model, HttpServletRequest request) {
		String redirectUri = request.getParameter("redirect");
		model.addAttribute("loginForm", new LoginForm(redirectUri));
		return "loginPage";
	}

	@PostMapping("")
	public String loginPost(@Valid @ModelAttribute("loginForm") LoginForm loginForm, BindingResult results, Model model,
			HttpServletRequest request) {
		if (results.hasErrors()) {
			model.addAttribute("loginForm", loginForm);
			return "loginPage";
		}

		// vérification : mot de passe correct ?
		// ...
		// ...
		HttpSession session = request.getSession();
		if (session.getAttribute("userInfo") != null) {
			UserInfo userInfo = ((UserInfo) session.getAttribute("userInfo"));
			userInfo.setConnected(true);
			userInfo.setUsername(loginForm.getUsername());
//			if (userInfo.getRedirect() != null && !userInfo.getRedirect().isEmpty()) {
//				return "redirect:" + userInfo.getRedirect();
//			}
			if (loginForm.getRedirect() != null && !loginForm.getRedirect().isEmpty()) {
				return "redirect:" + loginForm.getRedirect();
			}
		} else {
			session.setAttribute("userInfo", getUserInfo());
		}
		model.addAttribute("message", "Bonjour " + loginForm.getUsername());
		return "firstPage";
	}

	@GetMapping("/logout")
	public String logout(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		if (session.getAttribute("userInfo") != null) {
			((UserInfo) session.getAttribute("userInfo")).setConnected(false);
			String username = ((UserInfo) session.getAttribute("userInfo")).getUsername();
			model.addAttribute("message", "Goodbye " + username);
		}
		return "forward:/app/login";

	}
}
