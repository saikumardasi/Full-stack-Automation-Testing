package Javawithoops;

public class Main {
	public static void main(String[] args) {
		//Creating users-Students
		Student s1 = new Student("Sai kumar", "saikumar123@gmail.com", 101);
		Student s2 = new Student("Krishna", "krishna123@gmail.com", 102);
		
		//Creating Instructors
		Instructor i1 = new Instructor("Bob", "bob@gmail.com", 20);
		Instructor i2 = new Instructor("John", "john@gmail.com", 30);
		
		//Creating Admin
		Admin admin = new Admin("Admin", "admin.edulms@gmail.com", 1);
		
		//Courses created by instructor
		i1.courseName("Java");
		i1.courseName("Salesforce");
		i2.courseName("Python");
		i2.courseName("Datascience");
		
		//student-1 and 2 enrolled in courses
		s1.enrollCourse("Java");
		s1.enrollCourse("Python");
		
		s2.enrollCourse("Datascience");
		s2.enrollCourse("Salesforce");
		
		//view profile of Students
		s1.displayWelcome();
		s1.viewProfile();
		s2.displayWelcome();
		s2.viewProfile();
		
		//view profile of Instructors
		i1.viewProfile();
		i2.viewProfile();
		
		//view profile of Admin
		admin.viewProfile();
		
		//Students track Progress
		s1.trackProgress();
		s2.trackProgress();
		
		//admin.removeUser(s1);
		admin.removeUser(s2);	//Admin removing user
		
		Course c1 = new Course("Java", 40, 30);
		Course c2 = new Course("Salesforce",72 ,10 );
		c1.showCourseDetails();
		c2.showCourseDetails();
	}

}
