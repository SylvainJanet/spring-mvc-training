package springmvcapp.o4exceptions;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {

	@ExceptionHandler
	public String genException(Exception e, Model model) {
		model.addAttribute("message",
				"Erreur ! Type : " + e.getClass().getSimpleName() + " - Message : " + e.getMessage());
		return "firstPage";
	}

	@ExceptionHandler(NullPointerException.class)
	public String nullPointerException(NullPointerException e, Model model) {
		model.addAttribute("message", "Erreur de pointeur null !");
		return "firstPage";
	}
	
	@ExceptionHandler(ArrayIndexOutOfBoundsException.class)
	public String arrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException e, Model model) {
		model.addAttribute("message", "Erreur d'indice en dehors des limites !");
		return "firstPage";
	}

	
}
