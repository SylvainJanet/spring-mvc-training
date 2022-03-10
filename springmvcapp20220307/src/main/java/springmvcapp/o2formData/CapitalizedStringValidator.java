package springmvcapp.o2formData;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CapitalizedStringValidator implements ConstraintValidator<CapitalizedConstraint, String> {

	private boolean checkCapitalizedWord(String word) {
		if (word == null) {
			return false;
		}
		int i = 0;
		for (char c : word.toCharArray()) {
			if ((i==0) && Character.isLowerCase(c)) {
				return false;
			}
			if ((i!=0) && Character.isUpperCase(c)) {
				return false;
			}
			i++;
		}
		return true;	
	}
	
	
	@Override
	public boolean isValid(String stringToCheck, ConstraintValidatorContext context) {
		if (stringToCheck == null) {
			return false;
		}
		String[] words = stringToCheck.split(" ");
		for (String word: words) {
			if (!checkCapitalizedWord(word)) {
				return false;
			}
		}
		return true;
	}

}
