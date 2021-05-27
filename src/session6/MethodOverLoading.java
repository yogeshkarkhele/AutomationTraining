package session6;

public class MethodOverLoading {


	public static void main(String[] args) {
		MethodOverLoading methodOverLoading = new MethodOverLoading();
		methodOverLoading.addition(1, 2);
		methodOverLoading.addition(1, 2,3);


	}

	public void addition(int a ,int b) {
		int c= a+b ;
		System.out.println("Addition---->"+ c);

	}

	public void addition(int a ,int b,int c) {
		int d= a+b+c ;
		System.out.println("Addition---->"+ d);

	}

	public void functionA(String a ,int b) {

	}

	public void functionA(int b ,String a) {

	}
}
