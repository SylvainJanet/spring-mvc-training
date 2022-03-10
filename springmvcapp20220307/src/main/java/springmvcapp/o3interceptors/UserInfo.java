package springmvcapp.o3interceptors;

public class UserInfo {

	private String username;
	
	private boolean isConnected;
	
	private String redirect;

	public UserInfo(String username, boolean isConnected, String redirect) {
		super();
		this.username = username;
		this.isConnected = isConnected;
		this.redirect = redirect;
	}

	public UserInfo() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isConnected() {
		return isConnected;
	}

	public void setConnected(boolean isConnected) {
		this.isConnected = isConnected;
	}

	public String getRedirect() {
		return redirect;
	}

	public void setRedirect(String redirect) {
		this.redirect = redirect;
	}
	
	
}
