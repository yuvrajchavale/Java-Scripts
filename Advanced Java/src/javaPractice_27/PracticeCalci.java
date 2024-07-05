package javaPractice_27;

public class PracticeCalci {
	
	public int add(int x, int y) {
		int z = x + y;
		return z;
	}
	
	public int sub(int x, int y) {
		int z = x - y;
		return z;
	}
	
	public int mul(int x, int y) {
		int z = x * y;
		return z;
	}
	public int div(int x, int y) {
		int z = x / y;
		return z;
	}
	
	
	

	public static void main(String[] args) {
		PracticeCalci obj = new PracticeCalci();
		
		//addition
		int addition = obj.add(20, 30);
		System.out.println("Addition : " + addition);
		
		//subtraction
		int subtraction = obj.sub(addition, 45);
		System.out.println("Subtraction : " + subtraction );
		
		//Muliplication
		int multiplication = obj.mul(addition, subtraction);
		System.out.println("Multiplication : " + multiplication);
		
		//Division
		try{
			int division = obj.div(40, 0);
			System.out.println("Division : " + division);
		}
		catch (ArithmeticException e) {
			System.out.println("Please give rather than this " + e.getMessage());
		}
		}
				

	}


