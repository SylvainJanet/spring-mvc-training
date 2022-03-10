package springmvcapp.o2formData;

import javax.validation.constraints.NotBlank;

@FieldsValueMatch.List({
		@FieldsValueMatch(fields = {"email","emailCheck"}, message = "{error.email.donotmatch}"),
		@FieldsValueMatch(fields = {"password","passwordCheck"}, message = "{error.password.donotmatch}")		
		})
public class AccountCreation {

	@NotBlank(message = "{error.email.empty}")
	private String email;
	private String emailCheck;

	@NotBlank(message = "{error.password.empty}")
	private String password;
	private String passwordCheck;

	public AccountCreation() {
		super();
	}

	public AccountCreation(String email, String emailCheck, String password, String passwordCheck) {
		super();
		this.email = email;
		this.emailCheck = emailCheck;
		this.password = password;
		this.passwordCheck = passwordCheck;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailCheck() {
		return emailCheck;
	}

	public void setEmailCheck(String emailCheck) {
		this.emailCheck = emailCheck;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordCheck() {
		return passwordCheck;
	}

	public void setPasswordCheck(String passwordCheck) {
		this.passwordCheck = passwordCheck;
	}

}
