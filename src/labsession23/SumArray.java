package labsession23;

public class SumArray {
	    public static void main(String[] args) {
	        int[] arr = {70, 50, 30, 90, 20};
	        int sum = 0;
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];
	        }
	        System.out.println("Sum of array elements: " + sum);
	    }
	}