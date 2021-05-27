package session61;

import session6.AccessModifiers1;

public class AccessModifires3 {

	public static void main(String[] args) {
		AccessModifiers1 accessModifiers1 = new AccessModifiers1();
		accessModifiers1.methodA();
		//accessModifiers1.methodB();// not permitted outside package
		//accessModifiers1.methodC(); // not permitted outside package
		//accessModifiers1.methodD();// not permitted outside package
	}

}
