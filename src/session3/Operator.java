package session3;

public class Operator {


	public static void main(String[] args) {

		unaryOperator();
		arithmaticOperator();
		relationalOperator();
		bitwiseOperator();
		ternaryOperator();
		assignmentOperator();
	}

	public static void unaryOperator() {
		int x=10;  

		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12  

		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10 

		int a=10;  
		int b=-10;  
		boolean c=true;  
		boolean d=false;  
		System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
		System.out.println(~b);//9 (positive of total minus, positive starts from 0)  
		System.out.println(!c);//false (opposite of boolean value)  
		System.out.println(!d);//true  
	}

	public static void arithmaticOperator() {
		int a=10;  
		int b=5;  
		System.out.println(a+b);//15  
		System.out.println(a-b);//5  
		System.out.println(a*b);//50  
		System.out.println(a/b);//2  
		System.out.println(a%b);//0 
	}

	public static void relationalOperator() {
		int a=10;  
		int b=5;  
		int c=10;

		if(a > b)
			System.out.println("a is greater than b");

		if(a == c)
			System.out.println("a is equals to c");

		if(b < c)
			System.out.println("b is less than c");
	}

	//Not much important
	public static void bitwiseOperator() {

		//System.out.println(10 < 5 && 10 < 20);//false && true = false  
		//System.out.println(10 < 5 & 10 < 20);//false & true = false  

		//System.out.println(10 > 5 || 10 < 20);//true && true = true  
		//System.out.println(10 > 5 | 10 < 20);//true & true = true 

		System.out.println(2 | 2); 

		//1 0

		//1 0

		//1 0

		System.out.println(10>5 ^ 10>11);
	}

	public static void ternaryOperator() {
		int a=2;  
		int b=5;  
		int min = (a > b) ? a : b;  
		System.out.println(min); 

		String minStr = (a < b)? "true": "false";

		System.out.print(minStr);
	}

	public static void assignmentOperator() {

		int a=10;  
		int b=20;  
		a+=4; //a=a+4 (a=10+4)  
		b-=4; //b=b-4 (b=20-4)
		System.out.println(a);  
		System.out.println(b); 

	}
}
