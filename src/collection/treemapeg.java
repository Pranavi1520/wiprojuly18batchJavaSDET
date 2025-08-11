package collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class treemapeg {

	public static void main(String[] args) {
		
    Map<Integer, String>map = new TreeMap<Integer, String>();
		
		map.put(1 ,"Amit");
		map.put(2,"vijay");
		map.put(3,"Rahul");
		map.put(7, "rohit");
		//map.put(null, "pop");//nullpointer exception
		map.put(3, "Rahul");
		map.put(4,null);
		map.put(5,null);
		map.put(6, "vijay");
		
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
