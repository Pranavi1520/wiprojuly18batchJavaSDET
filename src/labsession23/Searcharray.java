package labsession23;

public class Searcharray {
	public static void main(String[] args) {
		        int[] arr = {20, 10, 30, 75, 25};
		        int target = 15;
		        int index = -1;
		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] == target) {
		                index = i;
		                break;
		            }
		        if (index != -1) {
		            System.out.println("Element " + target + " found at index " + index);
		        } else {
		            System.out.println("Element " + target + " not found in the array.");
		        }
		    }
		}


	}


