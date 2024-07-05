package javaPratice_28;

public class MethodOverloading {

	public void add(int a, int b) {
		System.out.println(a + b);
	}
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public void add(double a,double b) {
		System.out.println(a+b);
		
	}
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.add(10, 20);
		obj.add(13.5, 41.2);
		obj.add(10, 450, 357);
		

	}

}
