package loops;

public class DigitCount {

	public static void main(String[] args) {
		int num = 12345;
		int count = 0;
		if(num == 0){
			count = 1;
		}
		while(num!=0){
			num = num/10;
			count++;	
		}
		System.out.println("Digit count of the number " +count);
		}
}
