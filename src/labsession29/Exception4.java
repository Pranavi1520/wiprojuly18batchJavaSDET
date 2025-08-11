package labsession29;

public class Exception4 {

	public static void main(String[] args) {   
        try {
            System.out.println(1);
        } catch (Exception e) {
            System.out.println(2);
        } finally {
            System.out.println(4);
        }

        System.out.println(3); 
    }
}