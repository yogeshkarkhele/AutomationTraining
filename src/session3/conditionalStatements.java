package session3;

public class conditionalStatements {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		int c=30;

		//if
		if (a<b)
			System.out.println("conditiona is true");


		//if-else
		if(a>b)
			System.out.println("will not print");
		else
			System.out.println("else block printed");


		//if-else if- else
		if(a>b)
			System.out.println("will not print");
		else if(b>b)
			System.out.println("will not print else if blcok");
		else if(c>b)
			System.out.println("new else if block");
		else
			System.out.println("else block printed");

		switchStatement();

	}


	public static void switchStatement() {

		int number=10; //Change this value and observe output

		//Switch expression  
		switch(number){  
		//Case statements  
		case 10: System.out.println("10");  
		break;  

		case 20: System.out.println("20");  
		break; 

		case 30: System.out.println("30");  
		break;  

		default:
			System.out.println("Not in 10, 20 or 30");  //Default case statement  
		}  
	}
}
