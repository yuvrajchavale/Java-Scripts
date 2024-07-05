package javaPractice_26;

public class StaticMethodCalling {

	static int x,y,z;
	
	public static void addition() {
		x = 400;
		y = 500;
		z = x+y;
		System.out.println("Addition:  f" + z);
	}
	
	public static void subtraction() {
		x = 500;
		y = 350;
		z = x-y;
		System.out.println("Subtraction: " + z);
	}
	public static void division() {
	
	try {	
		x = 200;
		y = 0;
		z =x/y;
		System.out.println("Division: " + z);
	}
	catch (ArithmeticException e) {
		System.out.println("Please Enter Denominator rather than zero" +"\n"+ "Exception Found"  + e.getMessage());
		
	}
	}
	public static void multiplication() {
		x = 10;
		y = 30;
		z = x*y;
		System.out.println("Multiplication: " + z);
	}
	
	
	public static void main(String[] args) {
		
		//By class name
		StaticMethodCalling.addition();
		StaticMethodCalling.subtraction();
		StaticMethodCalling.division();
		StaticMethodCalling.multiplication();
	}

}
