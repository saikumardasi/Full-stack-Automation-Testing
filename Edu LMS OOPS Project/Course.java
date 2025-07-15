package Javawithoops;

public class Course {
	private String title;
	private int durationInHours;
	private final int maxStudents;		//final for maxStudents can't be changed
	
	//Constructor 1: Accepts title, duration, and maxStudents 
	public Course(String title, int durationInHours, int maxStudents ) {
		this.title = title;
		this.durationInHours = durationInHours;
		this.maxStudents = maxStudents;
	}
	
	// Constructor 2 (default durationInHours, maxStudents)
	public Course(String title) {
		this.title = title;
		this.durationInHours = 50;
		this.maxStudents = 20;
	}
	
	public String getTitle() {			//getter and setter methods
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getDurationInHours() {
		return durationInHours;
	}
	
	public void setDurationInHours(int durationInHours) {
		this.durationInHours = durationInHours;
	}
	
	public int getMaxStudents(int maxStudents) {  //no setter method because it's final method
		return maxStudents;
	}

	public void showCourseDetails() {		//showCourseDetails method
		System.out.println("<------Course Details------>");
		System.out.println("Title: " +title);
		System.out.println("Duration of the course : " +durationInHours);
		System.out.println("Maximum number of students for the course are :"+maxStudents);
	}

}
