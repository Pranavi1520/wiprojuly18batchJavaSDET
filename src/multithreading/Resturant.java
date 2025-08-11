package multithreading;

public class Resturant{

	public static void main(String[] args) {

		CookinTask t1 = new CookinTask("Pasta");
		CookinTask t2 = new CookinTask("Dosa");
		CookinTask t3 = new CookinTask("salad");
		CookinTask t4 = new CookinTask("idly");
		CookinTask t5 = new CookinTask("rice");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}

}
