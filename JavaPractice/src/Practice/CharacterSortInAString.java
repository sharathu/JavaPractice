package Practice;

//Program to sort the given string and print all lower case first followed by all upper case letters n the string
import java.util.*;

public class CharacterSortInAString {

	public static void main(String[]args)
	{
		String str= new Scanner(System.in).nextLine();
		Character[] arr= new Character[str.length()];
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			arr[i]=str.charAt(i);
		}
		 str=new TreeSet<Character>(Arrays.asList(arr)).toString().replaceAll("[\\[\\], ]", "");
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a' & str.charAt(i)<='z')
				{temp=temp+str.charAt(i);
				str=str.replace(str.charAt(i),'\u0000');
				}
		}
		System.out.println(temp+str);
		
		Map<String,Integer> mp=new HashMap<String,Integer>();
		mp.put("A", 1);
		mp.put("B", 2);
		mp.put("C", 3);
		
		System.out.println(mp.toString());
	}
}

