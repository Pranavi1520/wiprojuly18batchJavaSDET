package wrapclass;

public class wrapunboxboxeg {
	
		public static void main(String[] args) {

			//autoboxing convert data type to object
			
			int a = 78;
			
			//autoboxing
			
			//Integer i = Integer.valueOf(a);
			
			Integer i = a;
			
			System.out.println(i);
			
			//unboxing
			
			Integer a1 = new Integer(3);
			
			int i1 = a1.intValue();
			
			int j = a1;
			
			System.out.println(i1);
			
			System.out.println(j);

		}

	}
