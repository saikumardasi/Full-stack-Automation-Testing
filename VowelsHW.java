package methodsandvariables;

public class VowelsHW {

	public static void main(String[] args) {
		
		String str = "Hello how are you doing today?";
		str = str.toLowerCase();
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'  || str.charAt(i) == 'o'  || str.charAt(i) == 'u' ) {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
