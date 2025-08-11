package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;

public class filterinputeg {

	public static void main(String[] args) {
		
		//filter streams filter data as they read and write data in the input stream
		
		//filters it and pass to on to the underlying stream
		
		FileInputStream fis = null;
		
		FilterInputStream filterinput = null;
		
		try {
			
			//create file input stream of the file
			
			fis = new FileInputStream("C://Users//pranavi//Downloads//handling.txt/");
			
			//wrap file input stream with buffered input stream
			
			filterinput = new BufferedInputStream(fis);
			
			//read and print the file content
			
			int data;
			
			while((data = filterinput.read())!=-1){
				
				System.out.print((char)data);
			}
			
			fis.close();
		}catch (Exception e) {
			
			System.out.println(e);
		}

	}

}
