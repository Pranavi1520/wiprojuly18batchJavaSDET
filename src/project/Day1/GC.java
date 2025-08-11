package project.Day1;

public class GC {
	protected void Finalize()throws Throwable {
		System.out.println("object is grabage collected");
	}
	//null refernce
	//reassiging the refernce
	//object is out of scope
	public void finalize() {
		System.out.println("object is garbage collected");
	}
	public static void main(String[] args) {
		GC obj = new GC();
		obj = null;
		//by nulling the refereence
		GC obj1 = new GC();
		GC obj2 = new GC();
		obj1 = obj2 ;
		//object is out of scope
		GC obj4 = new GC();
		//system.gc();
		Runtime.getRuntime().gc();
		
	}

}
