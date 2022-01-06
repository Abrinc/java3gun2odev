package odev2;

public class User {
private int userId;
private String userName ;
private String userLastname;
private String userMail;
private String userPassword;


public User(int userId, String userName, String userLastname, String userMail, String userPassword) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.userLastname = userLastname;
	this.userMail = userMail;
	this.userPassword = userPassword;
}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserLastname() {
		return userLastname;
	}
	public void setUserLastname(String userLastname) {
		this.userLastname = userLastname;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

}
