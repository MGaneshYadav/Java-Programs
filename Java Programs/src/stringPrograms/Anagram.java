package stringPrograms;

public class Anagram {

	public static void main(String[] args) {

		String s1="race";
		String s2="care1";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(s1.length()==s2.length())
		{
			boolean flag=true;
			for(int i=0;i<s1.length();i++)
			{
				for (int j = 0; j < s2.length(); j++) 
				{
					if(s1.charAt(i)==s2.charAt(j))
					{
						flag=true;
					}
					else
					{
						flag=false;
					}
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
