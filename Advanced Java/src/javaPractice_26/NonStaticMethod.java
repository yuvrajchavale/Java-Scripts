package javaPractice_26;

public class NonStaticMethod {
	static int w,e,r;

	public void addition() {
	 w = 30;
	 e = 20;
	 r = w+e;
	 System.out.println(r);
	 	 	
	}
	
	
	public static void subtraction() {
		 w = 30;
		 e = 20;
		 r = w-e;
		 System.out.println(r);
			
		}
	
	public static void main(String[] args) {
		NonStaticMethod N = new NonStaticMethod();
		System.out.println("Non Static One");
		N.addition();
		System.out.println("Static One Using Non Static Object");
		N.subtraction();
		System.out.println("Calling By Class ");
		NonStaticMethod.subtraction();
		//From Exception handling Class From other Package
		ExceptionHandling.division();
		//From Static method calling from other Package 
		StaticMethodCalling.multiplication();
	}
}
