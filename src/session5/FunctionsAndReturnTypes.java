package session5;

public class FunctionsAndReturnTypes {
	
	public static void main(String[] args) {
		
		FunctionsAndReturnTypes functionsAndReturnTypes = new FunctionsAndReturnTypes();
		//functionsAndReturnTypes.MethodA();
		//functionsAndReturnTypes.MethodWithParameter(1, 5);
		int addition = functionsAndReturnTypes.MethodWithParameterAndReturnType(1, 2);
		System.out.println("InMainMethod--->"+ addition);
		GlobalAndLocalVariable.methodAEdit();
		
	}
	
	/*
	 * public void MethodA() { System.out.println("Simple method"); }
	 * 
	 * public void MethodWithParameter(int a, int b) { int c= a+b;
	 * 
	 * 
	 * System.out.println("MethodWithParameter-->Addition-->"+ c); }
	 */
	
	public int MethodWithParameterAndReturnType(int a, int b) {
		int c= a+b;
		
		System.out.println("MethodWithParameterAndReturnType-->Addition-->"+ c);
		return c;
	}
	
	

}
