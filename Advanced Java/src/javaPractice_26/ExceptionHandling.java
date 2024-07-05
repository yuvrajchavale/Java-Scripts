package javaPractice_26;

public class ExceptionHandling {
	
	static int a,b,c;
	
	public static void division() {
		try {
		a = 30;
		b = 0;
		c = a/b;
		System.out.println(c);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Please change the denominator");
		}
	}

	public static void main(String[] args) {
		
		//By method Name calling 
		division();
	

	}

}
