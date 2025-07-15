package Javawithoops;

public class Admin extends User {

	public Admin(String name, String email, int userId){
		super(name, email, userId);
		
	}
	
	public void removeUser(User user) {
		System.out.println("Removing User: " + user.getName());
	}
	
	//abstract method
	@Override
	public void viewProfile() {
		System.out.println("<-----Admin Profile Details----->");
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("AdminId: " + getUserId());
	}

}
