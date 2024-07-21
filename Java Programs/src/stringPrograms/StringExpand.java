package stringPrograms;

public class StringExpand {

	public static void main(String[] args) {

		String s1="a4b2c1d2";
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>='0' && ch<='9')
			{
				int num=ch-48;
				for(int j=0;j<num-1;j++)
				{
					s2=s2+s1.charAt(i-1);
				}
			}
			else
			{
				s2=s2+s1.charAt(i);
			}
		}
		System.out.print(s2);
	}

}
