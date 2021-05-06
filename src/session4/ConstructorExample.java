package session4;

public class ConstructorExample {

	private int var;

	// default constructor
	public ConstructorExample()
	{
		this.var = 10;
	}

	// parameterized constructor and constructor overloading
	public ConstructorExample(int num)
	{
		this.var = num;
	}

	public int getValue() {
		return var;
	}

	public static void main(String args[]) {
		ConstructorExample obj1 = new ConstructorExample();
		ConstructorExample obj2 = new ConstructorExample(100);
		System.out.println("var is: " + obj1.getValue());
		System.out.println("var is: " + obj2.getValue());
	}
}
