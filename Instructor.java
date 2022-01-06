package odev2;

public class Instructor extends User {
	
 String instructorTrainings;
 String instructorCourse;

public Instructor(int userId, String userName, String userLastname, String userMail, String userPassword,
		String instructorTrainings, String instructorCourse) {
	super(userId, userName, userLastname, userMail, userPassword);
	this.instructorTrainings = instructorTrainings;
	this.instructorCourse = instructorCourse;
}
public String getInstructorTrainings() {
	return instructorTrainings;
}
public void setInstructorTrainings(String instructorTrainings) {
	this.instructorTrainings = instructorTrainings;
}
public String getInstructorCourse() {
	return instructorCourse;
}
public void setInstructorCourse(String instructorCourse) {
	this.instructorCourse = instructorCourse;
}

}
