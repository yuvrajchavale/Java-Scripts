package javaPractice_27;

public class ReturnWithorWithoutValue {
 

	public static void addition(int x,int y) {
		
		x = 100;
		y = 29;
		int z= x+y;
		System.out.println("Addition : " + z);
		
	}
	
	public static String stringCompare(String str1,String str2) {
		
		String res;
		if (str1.equalsIgnoreCase(str2)) {
			res = "String Matching";	
		} else {
			res = "String Not Matching";
		}
		return res;
	}
	
	public static boolean valueCompare(int x,int y) {
		if (x==y) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	public static void main(String[] args) {
		ReturnWithorWithoutValue.addition(100, 200);
		String result = ReturnWithorWithoutValue.stringCompare("Yuvraj", "yuvraj");
		System.out.println(result);
		boolean result2 =  ReturnWithorWithoutValue.valueCompare(100, 10);
		System.out.println(result2);
		
	}

}
