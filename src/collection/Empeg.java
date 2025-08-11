package collection;

public class Empeg {
	
    int id;
    String name;
    double salary;

    public Empeg(int id, String name, double salary) {
    	
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
    	
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}


