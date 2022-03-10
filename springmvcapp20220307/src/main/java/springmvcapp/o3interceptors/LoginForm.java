package springmvcapp.o3interceptors;

import javax.validation.constraints.NotBlank;

public class LoginForm {

	@NotBlank()
	private String username;
	@NotBlank()
	private String password;
	public LoginForm() {
		super();
	}
	public LoginForm(String username, String password) {
		super();
		this.username = username;
		this.password = password;
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
	
	
}
