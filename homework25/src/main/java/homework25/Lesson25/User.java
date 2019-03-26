package homework25.Lesson25;

public class User {
	private String login;
	private String password;
	private String message;

	public User(String login, String password, String message) {
		this.login = login;
		this.password = password;
		this.message = message;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
