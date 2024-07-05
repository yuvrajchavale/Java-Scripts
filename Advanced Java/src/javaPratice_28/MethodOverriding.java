package javaPratice_28;

class Human{
	public void eat()
	{
		System.out.println("Human Eating");
	}
}
class Boy extends Human
{
	public void eat() 
	{
		System.out.println("Boy Eating");
	}
}

public class MethodOverriding {
	
	public static void main(String[] args)
	{
		Boy obj = new Boy();
		obj.eat();
		Human obj2 = new Human();
		obj2.eat();
	}

}
