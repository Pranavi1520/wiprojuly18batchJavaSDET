package IO;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class charstringreadwrite {

public static void main(String[] args) throws IOException {
				
	// read and writing line by line using String reader and writer
	
	StringWriter sw = new StringWriter();
	
    sw.write("I am the String file writer");
    
    sw.close();
    
    // read the String
    
    StringReader sr = new StringReader(sw.toString());

    int rw;
    
    while ((rw = sr.read()) != -1) {
    	
        System.out.print((char) rw);
    }

    sr.close();
}
}
