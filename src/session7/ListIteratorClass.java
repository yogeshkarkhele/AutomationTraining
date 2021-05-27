package session7;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorClass {

	public static void main(String[] args) {
		 List<Integer> listold1 = new LinkedList<Integer>(); 
		  listold1.add(2); 
		  listold1.add(1);
		  listold1.add(3);
		  
		  ListIterator<Integer> listIterator= listold1.listIterator();
		  while(listIterator.hasNext()) {
			//  System.out.println("listIterator-->" + listIterator.next());
		  }
		  
		  while(listIterator.hasPrevious()) {
			  System.out.println("listIterator-->" + listIterator.previous());
		  }

	}

}
