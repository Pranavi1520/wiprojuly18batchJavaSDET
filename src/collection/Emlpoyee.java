package collection;

public class Emlpoyee {
	
	int id;
	
	String name;
	
	Emlpoyee(int id, String name){
		
		this.id = id;
		
		this.name = name;
	}
	
	public String tostring() {
		
		return id+"_"+name;
	}

}