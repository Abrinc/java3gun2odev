package odev2;

public class UserManager {
		public void addUser (User user) 
			{
				System.out.println(user.getUserName() + " " + user.getUserLastname() + " adl� kullan�c� eklendi!");
			}

		public void addMultiple (User[] users) 
		{
			for(User user : users) 
				{
				addUser(user);
				}
	
		}

		public void updateUser (User user) 
		{
			System.out.println(user.getUserName() + " "+ user.getUserLastname()+ " adl� kullan�c� g�ncellendi!");
		}

		public void updateMultiple (User[] users) 
		{
			for(User user : users) 
			{
				updateUser(user);
			}
		}

}
