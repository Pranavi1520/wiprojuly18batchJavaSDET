package labsession31;

import labsession30.Interface2;

public class Int2child implements Interface2{
	    public void bark() {
	        System.out.println("Dog is barking");
	    }
public static void main(String[] args) {
	        Interface2 myInt2child = new Int2child();  
	        myInt2child.bark();              
	    }
}


	