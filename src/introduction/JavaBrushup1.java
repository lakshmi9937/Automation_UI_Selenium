package introduction;

public class JavaBrushup1 {

	public static void main(String[] args) {
		// String is an object // string literal and using new memory allocate operator
		
		
		String s1 = "manikattu lakshmi narayana";
		
		String s2 = new String("Wellcome");
		String s3 = new String("Wellcome");
		
		String s = "manikattu lakshmi narayana";
		
		String[] splittedString = s.split("lakshmi");
				
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		
		// split the characters
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}

		// Reverse the string
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}


	}

}
