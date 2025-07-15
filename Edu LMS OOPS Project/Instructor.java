package Javawithoops;

public class Instructor extends User {
	private String createdCourse1; 	//Instance variables
	private String createdCourse2;
	
	Instructor(String name, String email, int userId){
		super(name, email, userId);			//super keyword should be called first
		this.createdCourse1 = createdCourse1;
		this.createdCourse2 = createdCourse2;
	}
	
	public String getCreatedCourse1(){	//using getter and setter methods
		return createdCourse1;
	}
	
	public void setCreatedCourse1(String createdCourse1) {
		this.createdCourse1 = createdCourse1;
	}
	
	public String getCreatedCourse2(){
		return createdCourse2;
	}
	
	public void setCreatedCourse2(String createdCourse2) {
		this.createdCourse2 = createdCourse2;
	}
	
	public void courseName(String courseName) {
		if(createdCourse1 == null) { 			//	|| createdCourse1.isEmpty()
			this.createdCourse1 = courseName; 
		}else if(createdCourse2 == null) {			// || createdCourse2.isEmpty() By using isEmpty() method with OR operator also work
			this.createdCourse2 = courseName;
		}else {
			System.out.println(getName()+ " has reached maximum limit of courses");
		} 
	}
	
	@Override	
	public void viewProfile() {				//abstract method is called
		System.out.println("<-----Instsructor Profile Details----->");
		System.out.println("Student Name: " +getName());
		System.out.println("Student Email: " +getEmail());
		System.out.println("Student UserID: " +getUserId());
		System.out.println("Created Courses: " +createdCourse1 +", " + createdCourse2 );

	}

}
