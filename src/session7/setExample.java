package session7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class setExample {

	public static void main(String[] args) {
	
		Set<String> set = new HashSet<String>();
		set.add(null);
		set.add(null);
		set.add("PQR");
		set.add("XYZ");
		//System.out.println("Set Values---->"+ set);
		
		
		
		  List<Integer> listold = new LinkedList<Integer>(); 
		  listold.add(2); 
		  listold.add(1);
		  listold.add(3);
		 
		  List<String> listold1 = new LinkedList<String>(); 
		  listold1.add("2"); 
		  listold1.add("1");
		  listold1.add("3");
		 
		
		List<List<Integer>> list = new LinkedList<List<Integer>>();
		list.add(listold);
		//list.add(listold1);
		

	}

}
