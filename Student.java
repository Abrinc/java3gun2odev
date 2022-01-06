package odev2;

public class Student extends User{

	String studentLinks;
	String studentContact;
	String studentCourse;
	
	public Student(int userId, String userName, String userLastname, String userMail, String userPassword,
			String studentLinks, String studentContact, String studentCourse) {
		super(userId, userName, userLastname, userMail, userPassword);
		this.studentLinks = studentLinks;
		this.studentContact = studentContact;
		this.studentCourse = studentCourse;
	}
	public String getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	public String getStudentLinks() {
		return studentLinks;
	}
	public void setStudentLinks(String studentLinks) {
		this.studentLinks = studentLinks;
	}
	public String getStudentContact() {
		return studentContact;
	}
	public void setStudentContact(String studentContact) {
		this.studentContact = studentContact;
	}
	
}
