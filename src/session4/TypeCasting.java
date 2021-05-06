package session4;

public class TypeCasting {

	public static void main(String[] args) {
		WideningTypeCastingExample();
		//NarrowingTypeCastingExample();
	}

	public static void WideningTypeCastingExample() {
		
		//byte -> short -> char -> int -> long -> float -> double  
		
		int x = 7;
		// automatically converts the integer type into long type
		long y = x;
		// automatically converts the long type into float type
		float z = y;
		
		
		System.out.println("Before conversion, int value " + x);
		System.out.println("After conversion, long value " + y);
		System.out.println("After conversion, float value " + z);
	}

	public static void NarrowingTypeCastingExample() {
		
		//double -> float -> long -> int -> char -> short -> byte  
		
		double d = 2147483648d;
		// converting double data type into long data type
		long l = (long) d;
		// converting long data type into int data type
		int i = (int) d;
		
		//i=65;
		char ch = (char) i;
		System.out.println("Before conversion: " + d);
		// fractional part lost
		System.out.println("After conversion into long type: " + l);
		// fractional part lost
		System.out.println("After conversion into int type: " + i);
		
		System.out.println("After conversion into char type: " + ch);
	}
}
