package session4;

public class Loops {

	public static void main(String[] args) {
		
		//While loop
		int i=0;
		while(i < 5) {
			System.out.println(i);
			i++;
		}
		
		//Do while loop
		i=6;
		do {
			System.out.println(i);
			i ++;
		} while(i < 5);
		
		//For loop
		int []array = {1,3,2,1,4};
		for(int j=0; j<array.length;j++) {
			System.out.println(array[j]);
		}
		
		//for each loop
		for(int element:array) {
			System.out.println(element);
		}
	}
}
