package session6;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionHandling {

	public static void main(String[] args) {
		ExceptionHandling ecExceptionHandling = new ExceptionHandling();
		ecExceptionHandling.methodB();
	}

	public void methodA() {
		try {
			int a= 1;
			int b=0;
			int c=a/b;
			System.out.println("Division--->"+ c);
		}

		catch (ArithmeticException e) {
			System.out.println("ArithmeticException block");
			try {
			int c = 2/0;
			}
			catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch (Exception e) {
			System.out.println("in Exception block");
		}

		finally {
			System.out.println("in Finally block");
		}
	}
	
	public void methodB(){
		
		
		throw new ArithmeticException("account number exceeded its count");
		
		
	}
}
