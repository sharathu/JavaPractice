package Practice;

import java.util.Scanner;

public class RemoveSpecialCharacter {

	public static void main(String...args)
	{
		String str= new Scanner(System.in).nextLine();
		String[] arr=str.split(" ");
		for(int i=0; i<arr.length;i++)
		{
			String temp="";
			for(int j=0;j<arr[i].length();j++)
			{
				char ch=arr[i].charAt(j);
				if((ch>='a'|ch>='A') & (ch<='z'|ch<='Z')|(ch>='0' & ch<='9'))
				{
					temp=temp+ch;
				}
				
			}
			System.out.println(temp);
		}
	}
}
