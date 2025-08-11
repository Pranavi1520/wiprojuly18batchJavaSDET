package IO;

import java.io.ByteArrayInputStream;

public class bytearrayinputeg {

	public static void main(String[] args) {
		
		//read the array of input data 
		
		byte[] array = {1, 2, 3, 4, 5};

		try {
			
			ByteArrayInputStream input = new ByteArrayInputStream(array);
			
			for (int i = 0; i < array.length; i++) {
				
				//read the bytes
				
				int data = input.read();
				
				System.err.println(data);
			}
			input.close();
			
		}catch (Exception e) {
			
			System.out.println(e);
		}
	}

}
