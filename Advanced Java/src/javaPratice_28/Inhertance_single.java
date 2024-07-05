package javaPratice_28;

public class Inhertance_single {

	
	
	public static void main(String[] args) {
		int add = Child.add(500, 200);
		System.out.println(add);
		
		int sub = Child.sub(add, 400);
		System.out.println(sub);

	}

}


 class  Parent {
	 
	 public static int add(int x, int y) {
		 int z = x + y;
		 return z;
	 }
	
}
 
 class Child extends Parent {
	 public static int sub(int a, int b) {
	 int c = a -b;
	 return c;
	 }
 }

