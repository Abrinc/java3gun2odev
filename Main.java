package odev2;

public class Main {
	public static void main (String [] args)
	{
		Student student = new Student(1,"Cafer","Abrin�","abrinc97@gmail.com",("123456"),"https://www.linkedin.com/in/cafer-abrin%C3%A7-252220178/",
				"java","5439253139");
		Student student1 = new Student(2,"Zafer","Abrin�","abrinc09@gmail.com","123456","https://www.linkedin.com/in/cafer-abrin%C3%A7-252220178/",
				"java","54392517**");
		Instructor instructor= new Instructor(3,"Engin","Demiro�","engindemirog@gmail.com","123456","Odt�",
				"java,javascript ");
		
		
		UserManager userManager = new UserManager();
		User [] users= {student,student1,instructor};
		userManager.addMultiple(users);
		userManager.updateMultiple(users);
		
		
		
	}
}
