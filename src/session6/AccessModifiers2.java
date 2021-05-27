package session6;

public class AccessModifiers2 {

	public static void main(String[] args) {
		AccessModifiers1 accessModifiers1 = new AccessModifiers1();
		accessModifiers1.methodA();
		accessModifiers1.methodB();
		accessModifiers1.methodC();
		//accessModifiers1.methodD(); //private is accessible on in same class

	}

}
