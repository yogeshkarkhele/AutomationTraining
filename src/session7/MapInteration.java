package session7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInteration {
	
	public static void main(String[] args) {
		//read data excel
		Map<Integer, Object> map =new HashMap<Integer, Object>();
		map.put(1, "Yogesh");
		map.put(2, "INDIA");
		map.put(3, "123456");
		
		map.get(1);
		
		
		 Set<Map.Entry<Integer, Object>> iterator= map.entrySet();
		 Iterator<Entry<Integer, Object>> i= iterator.iterator();
		while(i.hasNext()) {
			System.out.println("Map--->"+ i.next());
		}
		
		
	}

}
