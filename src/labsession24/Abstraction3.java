package labsession24;

abstract class Bill {
	
	abstract void generateBill();
}
class ElectricityBill extends Bill{
	
	void generateBill() {
		
		System.out.println("Electricity Bill");
	}
}
class WaterBill extends Bill{
	
	void generateBill() {
		
		System.out.println("WaterBill");
	}
}
public class Abstraction3{
	public static void main(String[] args) {
		
		Bill EB = new ElectricityBill();
		Bill WB = new WaterBill();
		
		EB.generateBill();
		WB.generateBill();
		
	}

}
