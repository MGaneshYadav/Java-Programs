package programs_50;

public class P12_CovertUpperToLowerAndLowerToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Ganesh Yadav";
		String s2="";
		for (int i = 0; i < s1.length(); i++) 
		{
			char ch=s1.charAt(i);
			if(ch>='a' && ch<='z')
			{
				s2=s2+(char)(ch-32);
			}
			else if(ch>='A' && ch<='Z')
			{
				s2=s2+(char)(ch+32);
			}
			else
			{
				s2=s2+ch;
			}
		}
		System.out.println(s2);

	}

}
