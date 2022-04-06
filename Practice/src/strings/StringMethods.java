package strings;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String A="Yogendra";
		String B="Chaudhari";
		String E="yogendra";
		
		
		String C= new String("Yogendra Chaudhari");
	
		String F=new String("Yogendra Chaudhari");
		
		
		//methods in string 
		
		//finding length of string
		
		
		System.out.println(A.length());
		
		//making all letters uppercase
		
		System.out.println(A.toUpperCase());
		
		//making all letters to lowercase
		
		System.out.println(A.toLowerCase());
		
		//to find char at particular index
		
		System.out.println(A.charAt(2));
		
		//to find index at particular char
		
		System.out.println(A.indexOf('n'));///from start side
		
		System.out.println(B.indexOf("a"));//from start side
		
		System.out.println(B.lastIndexOf("a"));///from last side
		
		//to find if both string are equal or not
		
		System.out.println(B.equals(A));
		System.out.println(B==A);
		
		//to find both string are same or not except cases
		
		System.out.println(E.equalsIgnoreCase(A));
		
		//to find if string contains mentioned letters or words
		
		System.out.println(A.contains("og"));
		
		//to find if string id empty or not
		
		System.out.println(A.isEmpty());
		
		//to add two sprints
		
		System.out.println(A.concat(" "+B));
		
		//to add any words at end of sprint
		
		System.out.println(A.concat(" vilas chaudhari"));
		
		//to add any words at start of sprint
		
		System.out.println("My Name is ".concat(A));
		
		//to check if particular string is starts with or not
		
		System.out.println(A.startsWith("Yo"));//sensitive abt cases too
		
		//to check if string ends with or not
		
		System.out.println(A.endsWith("ra"));
		
		//to split string at spaces
		
		System.out.println(C.split(" "));
		
		//to make a substring from mentioned index position
		
		System.out.println(A.substring(3));
		
		//to make substring within the mentioned index positions
		
		System.out.println(A.substring(1,5));
		
		//to check if two strings in not constant pool area are equal or not
		
		System.out.println(C==F);
		
		System.out.println(A==E);
		
		
		
	}

}
