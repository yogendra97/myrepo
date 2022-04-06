package strings;

public class Reversestring {
	
	
	public static void main(String[] args) {
		
	
	String str="Madam";
	String Rev="" ;
	
	int A=str.length();
	
	for(int i=A-1;i>=0;i--)
	{
		char B=str.charAt(i);
		Rev=  Rev+B;
	}
	System.out.println(Rev);
	
	if(str.equalsIgnoreCase(Rev))
	{
		System.out.println("It is a palindrome string");
		
	}
	
	else
	{
		System.out.println("It is not a palindrome String");
	}

}
}