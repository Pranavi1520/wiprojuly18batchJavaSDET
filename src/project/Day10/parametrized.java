package project.Day10;

public class parametrized {
	
	public void add() {
		int a = 7;
		int b = 8;
		int c = a+b;
		System.out.println(c);
	}
	//method with parameters
	public void add1(int a, int b){
		int c = a+b;
		System.out.println(c);
	}
    //method returing a int value
	public int add2(int a , int b) {
		int c = a+b;
		return c;
	}
	public static void main(String[] args) {
		parametrized pm = new parametrized();
		pm.add();
		pm.add1(7, 8);
		pm.add1(5,4);
		pm.add1(-7, 4);
        int result = pm.add2(9, 5);
        System.out.println(result);
	}

}
