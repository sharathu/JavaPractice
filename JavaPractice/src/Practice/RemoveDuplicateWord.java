package Practice;

import java.util.*;

public class RemoveDuplicateWord {

	public static void main(String...args)
	{
		String str= new Scanner(System.in).nextLine();			
		System.out.println( new HashSet<String>(Arrays.asList(str.split(" "))).toString().replaceAll("[\\[\\],]", ""));
		
	}
}
