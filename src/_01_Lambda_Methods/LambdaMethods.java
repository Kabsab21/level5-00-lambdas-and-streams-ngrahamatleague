package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		
		System.out.println("____________ ");
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			System.out.println(s);
			String r ="";
			int n = s.length();
			for( int i = 0; i < n; i++ ) {
				r = r+s.charAt(s.length()-1);
				s = s.substring(0, s.length()-1);
			}
			System.out.println(r);
		}, "repeat");
		
		System.out.println("____________ ");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			System.out.println(s);
			String r ="";
			int n = s.length();
			for( int i = 0; i < n; i++ ) {
				if( i%2 == 0) {
					String v = ""+s.charAt(0);
					r = r+v.toUpperCase();
					s = s.substring(1, s.length());			
				}else {
					r = r+s.charAt(0);
					s = s.substring(1, s.length());			
				}

			}
			System.out.println(r);
		}, "repeat");
		
		System.out.println("____________ ");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			System.out.println(s);
			String r ="";
			int n = s.length();
			for( int i = 0; i < n; i++ ) {
				
					String v = ""+s.charAt(0);
					r = r+v+".";
					s = s.substring(1, s.length());			
				
			}
			
			System.out.println(r);
		}, "repeat");
		
		System.out.println("____________ ");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			System.out.println(s);
			String r ="";
			int n = s.length();
			for( int i = 0; i < n; i++ ) {
				if( s.charAt(0) == 'a' ||  s.charAt(0) == 'i' ||  s.charAt(0) == 'o' ||  s.charAt(0) == 'u' ||  s.charAt(0) == 'e') {
					s = s.substring(1, s.length());	
				}else {
					r = r+s.charAt(0);
					s = s.substring(1, s.length());			
				}

			}
			System.out.println(r);
		}, "repeat");
		
		
		
		
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
