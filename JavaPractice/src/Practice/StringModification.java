package Practice;

public class StringModification {
		
	public String upperCaseSplit(String str1)
	{
		String str2="";
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)>='A' & str1.charAt(i)<='Z')
			{
				str2=str2+str1.charAt(i);
			}
		}	
		return str2;
	}
	
	public String lowerCaseSplit(String str1)
	{
		String str2="";
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)>='a' & str1.charAt(i)<='z')
			{
				str2=str2+str1.charAt(i);
			}
		}	
		return str2;
	}
	
	public String lowerCaseSplitWithSpace(String str1)
	{
		String str2="";
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)==' '|str1.charAt(i)>='a' & str1.charAt(i)<='z')
			{
				str2=str2+str1.charAt(i);
			}
		}	
		return str2;
	}
	
	public String inverseCase(String str1)
	{
		String str2="";
		for(int i=0;i<str1.length();i++)
		{
			
			char ch;
			if(str1.charAt(i)>='A' & str1.charAt(i)<='Z')
			{
				 ch= Character.toLowerCase(str1.charAt(i));
			}
			else if(str1.charAt(i)>='a' & str1.charAt(i)<='z')
			{
				 ch= Character.toUpperCase(str1.charAt(i));
			}
			else 
				{ ch=' ';}
			str2=str2+ch;
		}	
		return str2;
	}
	
	public static void main(String...args)
	{
		String str= "Where Are You Going";
		StringModification st= new StringModification();
		System.out.println(st.upperCaseSplit(str)+" "+st.lowerCaseSplit(str));
		System.out.println(st.upperCaseSplit(str)+" "+st.lowerCaseSplitWithSpace(str));
		System.out.println(st.inverseCase(str));
	}

}
