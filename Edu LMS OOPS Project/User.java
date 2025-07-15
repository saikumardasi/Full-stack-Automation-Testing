package Javawithoops;

abstract class User {		//abstract class
	private String name;		//private access modifier is used
	private String email;		// Instance variables
	private int userId;
	
	public User(String name, String email, int userId ){	//Parameterized constructor for fields
		this.name = name;		//using this keyword
		this.email = email;
		this.userId = userId;
	}
	
	public String getName(){		// get method for name
		return name;
	}
	
	public String getEmail(){		// get method for Email
		return email;
	}
	
	public int getUserId(){		// get method for UserID
		return userId;
	}
	
	public void SetName(String name){
		this.name = name;
	}
	
	public void SetEmail(String email){
		this.email = email;
	}

	public void SetUserId(int userId){
		this.userId = userId;
	}

	public abstract void viewProfile();	//abstract method is used to show profile is declared in only abstract class--> no body for method	
	
	public final void displayWelcome() {	//final keyword with method name as displayWelcome with body
		System.out.println("<=================Profile================>");
		System.out.println("Welcome "+ name + " to LMS course platform");
	}

}
