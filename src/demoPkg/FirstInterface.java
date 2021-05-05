package demoPkg;

public interface FirstInterface {

	void addition();
	void substract();
	default void printA() {
		System.out.println("Default method");
	}	
}
