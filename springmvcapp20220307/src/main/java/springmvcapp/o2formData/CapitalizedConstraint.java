package springmvcapp.o2formData;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

// où peut on utiliser l'annotation ? Pour notre cas, sur des champs
@Target(ElementType.FIELD)
// comment stocker l'annotation ? Utile uniquement avant la compilation ou garder l'annotation dans l'archive ?
@Retention(RetentionPolicy.RUNTIME)
// quelle est la classe qui sera responsable de faire les vérifications de la contrainte ?
@Constraint(validatedBy = CapitalizedStringValidator.class)
public @interface CapitalizedConstraint {

	// définir les paramètres
	String message() default "String should be capitalized properly (default message)"; // Mon Prenom : OK | mon pRenom : KO

	// grouper différentes annotation de contraintes ensemble
	Class<?>[] groups() default {};

	// ajouter des infos supplémentaires
	Class<? extends Payload>[] payload() default {};
}
