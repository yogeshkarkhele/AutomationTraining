package demoPkg;

public class LearnInterface implements FirstInterface{

	public static void main(String[] args) {
		LearnInterface learnInterface = new LearnInterface();
		learnInterface.printA();
		learnInterface.addition();
		learnInterface.substract();

	}

	@Override
	public void addition() {
		System.out.println("in Addition");
		
	}

	@Override
	public void substract() {
		System.out.println("in Substract");
		
	}
	
	

}
