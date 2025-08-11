package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class mapeg {

	public static void main(String[] args) {

		Map<Integer, String>map = new HashMap<Integer, String>();
		
		map.put(1 ,"Amit");
		map.put(2,"vijay");
		map.put(3,"Rahul");
		map.put(null, "rohit");
		map.put(null, "pop");
		map.put(4,null);
		map.put(5,null);
		
		//System.out.println(map);
		
		//converting the map to the set
		
		Set set = map.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			
			Entry entry = (Map.Entry)itr.next();
			
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
				 
	}

}
