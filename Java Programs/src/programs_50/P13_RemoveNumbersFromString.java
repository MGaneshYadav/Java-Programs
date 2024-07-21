package programs_50;


public class P13_RemoveNumbersFromString {

	public static void main(String[] args) {


		String s1="1Gane53sh";
		String s2="";
		for (int i = 0; i < s1.length(); i++) 
		{
			char ch=s1.charAt(i);
			if(ch>='0' && ch<='9')
			{
				continue;
			}
			else
			{
				s2=s2+ch;
			}
		}
		System.out.println(s2);
	}

}
