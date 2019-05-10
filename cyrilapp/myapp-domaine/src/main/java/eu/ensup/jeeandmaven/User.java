package eu.ensup.jeeprojet.domaine;

public class User {
	
	private String login;
	private String pwd;
	public User(String login, String pwd) {
		super();
		this.login = login;
		this.pwd = pwd;
	}
	public User(){
		super();
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "User [login=" + login + ", pwd=" + pwd + "]";
	}
	
	
}
