package Practice;

import java.util.*;
import java.util.HashMap;
import java.util.Scanner;

public class RemoveDuplicateChar {

	public static void main(String...args)
	{
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		Character[] ch= new Character[str.length()];
		for(int i=0;i<str.length();i++)
		{
			ch[i]=str.charAt(i);
		}
		
		String str1=new HashSet<Character>(Arrays.asList(ch)).toString().replaceAll("[\\[\\], ]", "");
		System.out.println(str1);
	}

}
