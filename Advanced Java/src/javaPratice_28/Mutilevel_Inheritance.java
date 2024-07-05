package javaPratice_28;

public class Mutilevel_Inheritance {
	
	public static void main(String[] args) {
		
		ChildC objc = new ChildC();
		
		String EvenVerify = objc.Even_Num(12);
		System.out.println(EvenVerify);
		
		String S_Comparison = objc.String_Com("Yuvraj", "Chavale");
		System.out.println(S_Comparison);
		
		int Addition = objc.add1(100,20, 80);
		System.out.println(Addition);
		
		String  NumComparison = objc.NumComp(500, 400);
		System.out.println(NumComparison);
		

	}

}


	class Parentdd{
		
		public static int add1(int a, int b, int d){
			
			int c = a + b + d;
			return c;
		}
	}
	class ChildA extends Parentdd{
       public static String NumComp(int a, int b){			
			String  result;
    	   if (a<=b) {
				result = "A is Less Than B";
				
			} else {
				result = "B is Greater Than A";
			}
			
    	   return result;
			}
			
	}
	class ChildB extends ChildA{
		public String String_Com(String str1,String str2) {
			String res;
			
			if (str1.equalsIgnoreCase(str2)) {
				res = "String is Matching";
				
			} else {
				res = "String not matching";

			}
			
			return res;
		}
	}
	class ChildC extends ChildB{
		public String Even_Num(int a) {
			String Even;
			if (a%2==0) {
				Even="Even Number";
			} else {
				Even = "Odd Number";
			} 
			
			return Even;
		}
		
	}
	
	
	
	

