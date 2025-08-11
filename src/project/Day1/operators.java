package project.Day1;

public class operators {

	public static void main(String[] args) {
		//arthemtic operators
		int m = 9;
		int n = 5;
		int o = m + n;
		System.out.println(o);
		int j = m - n;
		// shift operators
		int a = 20;
	    int b = 25;
	    System.out.println(a==b);
	    System.out.println(a!=b);
	    System.out.println(a>b);
	    System.out.println(a<b);
	    System.out.println(a>=b);
	    System.out.println(a<=b);
	    
	    //bitwise operator
	    int p = 5;//0101
	    int q = 3;//0011
	    int r = p & q;//0001
	    System.out.println(r);
	    //8 and 2
	    int p1 = 8;
	    int q2 = 2;
	    int r1 = a & b;
	    System.out.println(r1);
	    //or
	    int a2 = 8;
	    int b2 = 2;
	    int r4 = a2|b2;
	    System.out.println(r4);
	    //xor
	    int a3 = 8;
	    int b3 = 2;
	    int r5 = a3^b3;
	    System.out.println(r5);
	    
	    
	   //Logical operators &&,|| AND !
	    int u = 10 , v = 20;
	    if (u<v&&v>15) {
	    	System.out.println("both conditions are true");
	    }
	    // || - returns true if at least one of the operands is true
	    int age = 25;
	    if(age<18||age>21) {
	    	System.out.println("condition is true");
	    }
	    //! NOT-reverse the logical state of the operand
	    boolean israining = false;
	    if(!israining) {
	    	System.out.println("you can go out");
	    }
	    
	    
	    //assignment operators// = += -=
	    int k = 10;
	    int l = 20;
	    k+= 4;//(k=k+4=14)
	    System.out.println(k);
	    l-= 4;//(l=l-4=20-4=16)
	    System.out.println(l);
	    
	    
	    //Ternary operartor short hand if -else
	    //condition ? expression_if_true:expressions_if_false
	    int w1 = 10,w2 = 20;
	    int max = (w1>w2)? w1:w2;
	    System.out.println(max);
	    
	}

}
