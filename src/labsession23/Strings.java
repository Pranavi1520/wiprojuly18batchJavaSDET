package labsession23;

public class Strings {

	public static void main(String[] args) {
		String s1 = "Hello world";
		System.out.println(s1);
		//2
		char[] ch = {'h','e','l','l','o'};
		String s2 = new String(ch);
		System.out.println(s2);
		//3 method
		String s3 = new String("Hello");
		System.out.println(s3);
		
		//equals method
		String str1 = "Mumbai";
		String str2 = "Delhi";
		System.out.println(str1.equals(str2));//false
		System.out.println(str1.equalsIgnoreCase(str2));
		//concat
		System.out.println(str1.concat(str2));
		//contains
		System.out.println(str1.contains("z"));//flase
		//substring
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(1,3));
		//replace
		System.out.println(str1.replace("i", "g"));
		System.out.println(str1.replaceAll(str1, "pune"));
		//is empty
		System.out.println(str1.isEmpty());
		//ends with
		System.out.println(str1.endsWith("e"));
		//join
		String str3 = String.join("_", "city", "Mumbai");
		System.out.println(str3);
		//compare to lexo graphical comp
		System.out.println(str2.compareTo(str3));
		//split
		String text = "java is a programming language";
		String[] result = text.split(" ");
		
		for (String str : result) {
			System.out.println(str + ",");
		}
	}

}
