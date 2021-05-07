package session5;

public class GlobalAndLocalVariable {

	int a= 5;
	public static void main(String[] args) {
		GlobalAndLocalVariable globalAndLocalVariable = new GlobalAndLocalVariable();
		globalAndLocalVariable.methodAEdit();
		globalAndLocalVariable.methodB();

	}
	
	
	public static void methodAEdit() {
		int a= 1;
		System.out.println("Inside methodA---->"+ a);
	}
	
	public void methodB() {
		//int a= 5;
		System.out.println("Inside methodB---->"+ a);
	}
	
	public void preDefinedMethod() {
		String a= "Test";
		String b= "test";
	
		
		System.out.println("Inside methodB---->"+ a);
	}


}
