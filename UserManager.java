package odev2;

public class UserManager {
		public void addUser (User user) 
			{
				System.out.println(user.getUserName() + " " + user.getUserLastname() + " adlý kullanýcý eklendi!");
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
			System.out.println(user.getUserName() + " "+ user.getUserLastname()+ " adlý kullanýcý güncellendi!");
		}

		public void updateMultiple (User[] users) 
		{
			for(User user : users) 
			{
				updateUser(user);
			}
		}

}
