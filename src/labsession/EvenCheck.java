package labsession;

public class EvenCheck {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static void main(String[] args) {
        int testNumber = 8; 
        if (isEven(testNumber)) {
            System.out.println(testNumber + " is even.");
        } else {
            System.out.println(testNumber + " is odd.");
        }
    }
}