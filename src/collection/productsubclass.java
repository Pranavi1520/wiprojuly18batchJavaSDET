package collection;

import java.util.*;

public class productsubclass implements Comparator<producteg> {

	public int compare(producteg p1, producteg p2) {
		
		return (int) (p1.price - p2.price);//sorting by price
    }

    public static void main(String[] args) {
    	
        List<producteg> products = new ArrayList<>();

        products.add(new producteg(1, "shampoo", 100));
        
        products.add(new producteg(2, "facewash", 150 ));
        
        products.add(new producteg(3, "cream", 120));
        
        products.add(new producteg(4, "glass", 165));

        Collections.sort(products, new productsubclass());

        for (producteg p : products) {
        	
            System.out.println(p);
        }
    }
}

