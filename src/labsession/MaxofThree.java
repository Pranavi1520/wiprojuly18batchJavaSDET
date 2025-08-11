package labsession;

public class MaxofThree {
    public static void main(String[] args) {
        int a = 32;
        int b = 78;
        int c = 90;
        int max;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println("The maximum number is: " + max);
    }
}