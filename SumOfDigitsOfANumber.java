package loops;

public class SumOfDigitsOfANumber {

	public static void main(String[] args) {
		int num = 1234;
		int sum = 0;
		int digit;
		while(num>0) {
			digit = num%10;
			sum = sum+digit;
			num = num/10;
		}
			System.out.println("Sum is = "+sum);
	}

}
