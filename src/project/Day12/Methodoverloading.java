package project.Day12;

public class Methodoverloading {
	
	//method add with 3 parameters
	public int add(int a,int b) {
		int c = a + b;
		
		return c;
	}
    //method add with 3 parameters
		public int add(int a,int b,int c) {
         int d = a + b + c;
         return d;
         
        		 
	}
    //method add with 4 parameters
		public int add(int a,int b,int c,int d) {
	int e = a + b + c + d;
	return e;
}
public static void main(String[] args) {
	Methodoverloading obj = new Methodoverloading();
	System.out.println(obj.add(1, 2));
	System.out.println(obj.add(1, 2, 3));
	System.out.println(obj.add(1, 2, 3, 4));
}
}