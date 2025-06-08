package myfirstpackage;

public class ConditionalStatement {
	public static void main(String[] args) {
		int math = 72;
		int science = 83;
		int english =90;
		int totalmarks = math + science + english;
		System.out.println("The toatl marks of the student is = "+totalmarks);
		int average = totalmarks/3;
		System.out.println("Average marks of the student is = "+average);
		float ave = totalmarks/3.0f;
		System.out.println("Average marks of the students in decimal points ="+ave);
		float percentage = (totalmarks/300f);
		float Percent = (percentage*100f);
		System.out.println("Percentage of the student is = "+Percent);
		if(average>=90 && average<=100){
			System.out.println("your grade is A+");
			System.out.println("Excellent Performance!");// TODO Auto-generated method stub
		}else if(average>=75 && average<=89){
			System.out.println("your grade is A");
			System.out.println("Excellent Performance!");
		}else if(average>=60 && average<=74) {
			System.out.println("your grade is B");
			System.out.println("Keep Improving");
		}else if(average>=40 && average<=59) {
			System.out.println("your grade is C");
			System.out.println("Keep Improving");
		}else {
			System.out.println("You are failed");
			System.out.println("please work harder next time");
		}
		if(math<35 || science<35 || english<35) {
			System.out.println("Failed due to low score in atleast one subject");
		}
	}
}