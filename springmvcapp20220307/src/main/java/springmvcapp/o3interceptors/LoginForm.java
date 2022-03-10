package springmvcapp.o3interceptors;

import javax.validation.constraints.NotBlank;

public class LoginForm {

	@NotBlank()
	private String username;
	@NotBlank()
	private String password;

	private String redirect;

	public LoginForm() {
		super();
	}

	public LoginForm(String redirect) {
		super();
		this.redirect = redirect;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRedirect() {
		return redirect;
	}

	public void setRedirect(String redirect) {
		this.redirect = redirect;
	}

}
