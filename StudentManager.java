package odev2;

public class StudentManager extends UserManager {

	public void addCourse (Student student) 
	{
	System.out.println("Öğrenciye "+ student.studentCourse + " kursu eklendi!" );
	}
	
	public void addContact (Student student) 
	{
	System.out.println("öğrencinin iletişim bilgileri : "+ student.studentContact);
	}
}
