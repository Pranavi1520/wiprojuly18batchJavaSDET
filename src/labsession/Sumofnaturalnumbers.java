package labsession;

public class Sumofnaturalnumbers {
    public static void main(String[] args) {
        int N = 9; 
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        } while (i <= N);
        System.out.println("Sum of first " + N + " natural numbers is: " + sum);
    }
}