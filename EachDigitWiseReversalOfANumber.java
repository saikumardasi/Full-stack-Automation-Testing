package loops;

public class EachDigitWiseReversalOfANumber {

	public static void main(String[] args) {
		int num=567890;
		int rev=0;
		int dig;
		while(num!=0) {
			dig = num%10;
			System.out.println("Last digit of the number is = "+dig);
			rev = rev*10+dig;
			num = num/10;
		}
		System.out.println("After Revesing the number is ="+rev);

	}

}
