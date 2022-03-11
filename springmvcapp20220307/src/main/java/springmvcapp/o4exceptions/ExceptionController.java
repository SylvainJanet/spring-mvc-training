package springmvcapp.o4exceptions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exception")
public class ExceptionController {

	@SuppressWarnings("null")
	@GetMapping("/1")
	public String test1() {
		String maChaine = null;
		maChaine = maChaine.toLowerCase();
		return "firstPage";
	}

	@GetMapping("/2")
	public String test2() {
		Object[] tab = { null, null };
		@SuppressWarnings("unused")
		Object obj = tab[2];
		return "firstPage";
	}

	@GetMapping("/3")
	public String test3() {
		int n = 0;
		@SuppressWarnings("unused")
		double x = 1 / n;
		return "firstPage";
	}

}
