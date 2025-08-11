package collection;

public class producteg {
	
    int id;
    String name;
    double price;

    public producteg(int id, String name, double price) {
    	
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString() {
    	
        return "Product{id=" + id + ", name='" + name + "', price=" + price + "}";
    }
}
