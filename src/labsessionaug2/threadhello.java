package labsessionaug2;

public class threadhello extends Thread {
    
    public void run() {
    	
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
    	
        threadhello t1 = new threadhello();
        
        t1.start(); 
    }
}
