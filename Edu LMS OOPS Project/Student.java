package Javawithoops;

public class Student extends User implements ProgressTrackable {
	
	private String enrolledCourse1; 	//Instance variables
	private String enrolledCourse2;
	
	Student(String name, String email, int userId){
		super(name, email, userId);			//super keyword should be called first
		this.enrolledCourse1 = enrolledCourse1;
		this.enrolledCourse2 = enrolledCourse2;
	}
	
	public String getEnrolledCourse1(){	//using getter and setter methods
		return enrolledCourse1;
	}
	
	public void setEnrolledCourse1(String enrolledCourse1) {
		this.enrolledCourse1 = enrolledCourse1;
	}
	
	public String getEnrolledCourse2(){
		return enrolledCourse2;
	}
	
	public void setEnrolledCourse2(String enrolledCourse2) {
		this.enrolledCourse2 = enrolledCourse2;
	}
	
	public void enrollCourse(String courseName) {
		if(enrolledCourse1 == null || enrolledCourse1.isEmpty()) {
			this.enrolledCourse1 = courseName; 
		}else if(enrolledCourse2 == null || enrolledCourse1.isEmpty()){
			this.enrolledCourse2 = courseName;
		}else {
			System.out.println(getName()+ ", you can not able to enroll for more than 2 courses, you've exceeded the limit");
		} 
	}
	
	@Override		//abstract method is used
	public void viewProfile(){
		System.out.println("<------Student Details------>");
		System.out.println("Student Name: " +getName());
		System.out.println("Student Email: " +getEmail());
		System.out.println("Student UserID: " +getUserId());
		System.out.println("Enrolled Courses: " +enrolledCourse1 +", " +enrolledCourse2);
	}
	
	@Override 
	//full-abstraction - Interface is used 
	public void trackProgress() {
		System.out.println(getName() +" tracking your progress.");

	}

}
