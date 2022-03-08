package springcoreapp.o3annotations;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;

@Component
public class International {

	@Value("${macle}")
	private String myKey;

	@Value("${someOtherParamater:valeur par défaut}")
	private String param;

	@Autowired
	private ResourceBundleMessageSource messageSource;

	@Override
	public String toString() {
		return "International [message=" + messageSource.getMessage("welcomeMessage", null, Locale.ENGLISH)
				+ "] - myKey : [" + myKey + "] - param : [" + param + "]";
	}

	// Il va exister un listener d'évenement : localeChangeInterceptor qui écoute
	// les
	// changements de locale
	// localeResolver : qui aura la responsabilité de donner la locale actuelle
	// ResourceBundleMessageSource : qui va avoir la responsabilité de chercher le
	// message
	// dans le fichier approprié (selon la locale fournie par le localeResolver)
}
