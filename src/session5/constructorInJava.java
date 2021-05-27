package session5;

public class constructorInJava {

	constructorInJava(){

	}
	{
		System.out.println("inside Instance block-1");
	}
	{
		System.out.println("inside Instance block-2");
	}

	constructorInJava(int i){
		System.out.println("inside constructorInJava--->" +i);
	}

	public static void main(String[] args) {

		constructorInJava constructorInJava = new constructorInJava();
		constructorInJava constructorInJava2 = new constructorInJava();
		//constructorInJava.methodA();
		constructorInJava constructorInJava3 = new  constructorInJava(5);

	}


	public void methodA() {
		System.out.println("Inside methodA---->");
	}

}
