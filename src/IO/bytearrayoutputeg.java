package IO;

import java.io.ByteArrayOutputStream;

public class bytearrayoutputeg {

	public static void main(String[] args) {

		String data = "This is a line of text inside the string";
		
		try {
			//creates output stream
			
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			
			byte[] array = data.getBytes();
			
			//write data to the op
			
			out.write(array);
			
			//retrieves data from the op stream
			
			String streamData = out.toString();
			
			System.out.println("Output stream:" + streamData);
			
			out.close();
			
		}catch (Exception e) {
			
			System.out.println(e);
		}
	}

}
