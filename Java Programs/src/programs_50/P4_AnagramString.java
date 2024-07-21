package programs_50;

import java.util.Arrays;

public class P4_AnagramString {
	
	public static void main(String[] args) {
	
	String s1=" Race";
	s1=s1.toLowerCase();
	char[] ch1=s1.toCharArray();
	Arrays.sort(ch1);
	
	String s2="Care ";
	s2=s2.toLowerCase();
	char[] ch2=s2.toCharArray();
	Arrays.sort(ch2);

	if(s1.length()==s2.length())
	{

		boolean flag = true;
		for (int i = 0; i < ch1.length; i++) 
		{
				if(ch1[i]==ch2[i])
				{
					break;
				}
				else
				{
					flag=false;
				}
		}
		if(flag==true)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not a Anagram");
		}
	}
	else
	{
		System.out.println("Not a Anagram");
	}
	
	
	}

}
