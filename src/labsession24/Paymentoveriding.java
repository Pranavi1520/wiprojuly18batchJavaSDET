package labsession24;

class payment {
 public void pay() {
     System.out.println("Processing payment...");
 }
}

class CreditCard extends payment {
 public void pay() {
     System.out.println("Payment made using Credit Card.");
 }
}

class UPI extends payment {
 public void pay() {
     System.out.println("Payment made using UPI.");
 }
}
class NetBanking extends payment {
 public void pay() {
     System.out.println("Payment made using Net Banking.");
 }
}
public class Paymentoveriding {
 public static void main(String[] args) {
     payment obj1=new payment();
     obj1.pay();
     CreditCard obj2=new CreditCard();
     obj2.pay();
     UPI obj3=new UPI();
     obj3.pay();
     NetBanking obj4=new NetBanking();
     obj4.pay();
 }
}
