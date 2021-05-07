package session5;

public class constructorInJava {

	constructorInJava(){

	}

	constructorInJava(int i){
		System.out.println("inside constructorInJava--->" +i);
	}

	public static void main(String[] args) {

		constructorInJava constructorInJava = new constructorInJava();
		constructorInJava.methodA();
		constructorInJava constructorInJava2 = new  constructorInJava(5);

	}


	public void methodA() {
		System.out.println("Inside methodA---->");
	}

}
