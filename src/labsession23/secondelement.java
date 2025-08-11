//2.Write a Java Program to print the second largest number in a given array.

package labsession23;

public class secondelement {

public static void main(String[] args) {
    	
        int[] arr = {34, 55, 18, 11, 78, 22};

        int sl = arr[0];
        
        int sl1 = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
        	
            if (arr[i] > sl) {
            	
                sl1 = sl;
                
                sl = arr[i];
                
            } else if (arr[i] > sl && arr[i] != sl) {
            	
                sl1 = arr[i];
            }
        }

        System.out.println("Second largest number is" );
        
        System.out.println(sl1);
    }
}
