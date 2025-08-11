package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class charfilewritereadexg {

	public static void main(String[] args) throws IOException {
		
		//write to file using file writer
		
		FileWriter fw = new FileWriter("C://Users//pranavi//Downloads//handling2.txt/");
		
		fw.write("I am the file writer");
		
		fw.close();
		
		//reading from the file using reader
		
		FileReader fr = new FileReader("C://Users//pranavi//Downloads//handling.txt/");
		
		int i;
		
		while((i = fr.read())!= -1) {
			
			System.out.print((char)i);
		}
		
		fr.close();
	}

}
