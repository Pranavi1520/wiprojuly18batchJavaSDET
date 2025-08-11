package IO;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class chararrayreadwrite {

public static void main(String[] args) throws IOException {
	
	//reading and line by line using charArray reader and writer
		
	CharArrayWriter cw = new CharArrayWriter();
	
    cw.write("I am the character file writer");
    
    cw.close();
    
    //reading the charArray

    CharArrayReader cr = new CharArrayReader(cw.toCharArray());

    int ro;
    
    while ((ro = cr.read()) != -1) {
    	
        System.out.print((char) ro);  
    }

    cr.close();
}
}