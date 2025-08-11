package project.Day4;

public class Encapuslation {
	
	//private fields-hidden outside
	
	private String name;
	private int age;
	
	//public fetter method for name
	
	public String getName() {
		
		return name;
	}
	
	//public setter method for name
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	//public getter method
	
	public int getAge() {
		
		return age;
	}
	
	//public setter method
	
	public void setAge(int age) {
		
		this.age = age;
	}

	public static void main(String[] args) {
		Encapuslation obj = new Encapuslation();
		
		obj.setAge(23);
		
		obj.setName("harry");
		
		System.out.println(obj.getName());
		System.out.println(obj.getAge());

	}

}
