package springmvcapp.o2formData;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.BeanWrapperImpl;

public class FieldsValueMatchValidator implements ConstraintValidator<FieldsValueMatch, Object> {

	private String[] fieldNames;

	@Override
	public void initialize(FieldsValueMatch constraintAnnotation) {
		fieldNames = constraintAnnotation.fields();
	}

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		
		Object[] fieldValues = new Object[fieldNames.length];
		
		int i = 0;
		for (String fieldName : fieldNames) {
			fieldValues[i] = new BeanWrapperImpl(value).getPropertyValue(fieldName);
			i++;
		}
		
		if (fieldNames.length == 0) {
			return true;
		}
		
//		for (Object propValue: values) {
//			if (values[0]==null) {
//				if (propValue != null) {
//					return false;
//				}
//			} else {
//				if (!values[0].equals(propValue)) {
//					return false;
//				}
//			}
//		}
		
		for (Object fieldValue: fieldValues) {
			if ((fieldValues[0]==null) && (fieldValue != null)) {
					return false;
			}
			if ((fieldValues[0]!=null) && !fieldValues[0].equals(fieldValue)) {
					return false;
			}
		}
		return true;
	}

}
