package IO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class serailizationeg {

	public static void main(String[] args) {
		
		try {
			
			//serialization is converting objects into byte
			
			//write object()
			
			//creating the object
			
			Student s1 = new Student(211, "Jhon");
			
			//creating the output stream writing the object
			
			FileOutputStream fout = new FileOutputStream("C://Users//pranavi//Downloads//handling.txt/");
			
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(s1);
			
			out.flush();
			
			//closing the stream
			
			fout.close();
			
			out.close();
			
			System.out.println("object is serialiazed");
			
		}catch(Exception e) {
			
			System.out.println(e);
		}
	}

}
