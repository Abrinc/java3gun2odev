package odev2;

public class InstructorManager extends UserManager{
public void addCours (Instructor instructor) 
{
	System.out.println("Eðitmenin "+instructor.instructorCourse +" kursu eklendi.");
}

public void addTrainings (Instructor instructor) 
{
	System.out.println("Eðitmenin "+instructor.instructorTrainings +" bilgileri");
}

}
