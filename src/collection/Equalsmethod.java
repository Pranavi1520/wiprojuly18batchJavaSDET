package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Equalsmethod{

int id;

String name;

 Equalsmethod(int id , String name) {
	 
	this.id = id;
	
	this.name = name;
}
 // Overiding equal () to compare the object content
 
 @Override
 
 public boolean equals(Object obj) {
	 
	 if (this == obj) return true ; // same reference
	 
	 if(obj == null || getClass()!= obj.getClass()) return false;

	 Emlpoyee other  = (Emlpoyee)obj;
	 
	 return this.id == other.id && this.name.equals(other.name);
 }

 @Override
 public int hashCode() {
	 
	 return Objects.hash(id ,name);
 }
 @Override
 public String toString() {
	 
		return id   + "_" + name;

	}

public static void main(String[] args) {


	List<Equalsmethod>  es = new ArrayList<>();
	
	es.add(new Equalsmethod (103, "Ravi"));
	
	es.add(new Equalsmethod (101, "Amit"));
	
	es.add(new Equalsmethod(102, "Zara"));

	es.add(new Equalsmethod (102, "Zara"));

	es.add(new Equalsmethod (104, "John"));

	for (Equalsmethod e: es ) {
		
		System.out.println(e);
	}
}

}
