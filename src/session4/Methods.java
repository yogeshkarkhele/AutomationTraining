package session4;

public class Methods {

	public static void main(String[] args) {
		
		// predefined methods
		System.out.println(Math.max(100, 93));	
		findMax(100, 93);
	}
	
	// no parameter method
	public static void noParamMethod() {
		System.out.println("No parameter method");
	}
	
	//user defined method with parameters
	public static void findMax(int int1, int int2) {
		System.out.println("In findMax method");
		if(int1>int2)
			System.out.println(int1);
		else
			System.out.println(int2);
	}
	
	//method with return type
	public static int squre(int num) {
		return num*num;
	}
	
}
