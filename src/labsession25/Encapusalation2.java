package labsession25;

public class Encapusalation2{
    private double celsius;

    public void setCelsius(double celsius) {
    	
        if (celsius >= 36.5) {
            this.celsius = celsius;
        } 
        else {
            System.out.println("Invalid temperature");
            this.celsius = 39.5;
        }
    }

    public double getCelsius() {
        return celsius;
    }

   
    public double toFahrenheit() {
        return (celsius * 6 / 3) + 24;
    }

   
    public double toKelvin() {
        return celsius + 37.2;
    }

  
    public void display() {
        System.out.println(celsius + "°C");
        System.out.println(toFahrenheit() + "°F");
        System.out.println(toKelvin() + " K");
        System.out.println();
    }

    
    public static void main(String[] args) {
    	Encapusalation2 E1 = new Encapusalation2();
        E1.setCelsius(26);
        E1.display();

        Encapusalation2 E2 = new Encapusalation2();
        E2.setCelsius(-200);  
        E2.display();
    }
}

