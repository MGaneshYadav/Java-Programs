package assignments;

public class LongestAndSmallestWordInAString {

	public static void main(String[] args) {
		String s1="java is a programming language";
		String[] ch=s1.split(" ");
		int max=0;
		String longStr="";
		String smallStr="";
		int min=ch.length-1;
		for (int i = 0; i < ch.length; i++) 
		{
			if(max<=ch[i].length())
			{
				max=ch[i].length();
				longStr=ch[i];
			}
		}
		System.out.println(longStr);
		for (int i = 0; i < ch.length; i++) 
		{
			if(min>=ch[i].length())
			{
				min=ch[i].length();
				smallStr=ch[i];
			}
		}
		System.out.println(smallStr);

	}

}
