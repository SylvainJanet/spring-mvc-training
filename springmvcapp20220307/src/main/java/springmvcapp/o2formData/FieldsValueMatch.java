package springmvcapp.o2formData;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = FieldsValueMatchValidator.class)
public @interface FieldsValueMatch {

	String message() default "Fields values don't match";
	
	String[] fields();
	
	@Target(ElementType.TYPE)
	@Retention(RetentionPolicy.RUNTIME)
	@interface List {
		FieldsValueMatch[] value();
	}

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
