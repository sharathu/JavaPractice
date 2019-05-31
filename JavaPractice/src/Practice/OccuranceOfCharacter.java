package Practice;

import java.util.*;
import java.util.Map.Entry;

public class OccuranceOfCharacter {

	public static void main(String[]args)
	{
		String str= new Scanner(System.in).nextLine();
		Map<Character,Integer> mp= new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			if(mp.containsKey(str.charAt(i)))
			{
				mp.put(str.charAt(i),mp.get(str.charAt(i))+1 );
			}
			else
				mp.put(str.charAt(i),1);
		}
		
		for(Entry<Character,Integer> e:mp.entrySet())
		{
			System.out.println(e.getKey()+""+e.getValue());
		}
	}
}
