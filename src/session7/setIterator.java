package session7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setIterator {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("ABC");
		set.add("XYZ");
		set.add("PQR");
		set.add("XYZ");
		//System.out.println("Set Values---->"+ set);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println("Set Values--->"+ iterator.next());
		}
		

	}

}
