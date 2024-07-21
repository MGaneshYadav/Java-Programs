package programs_50;

public class P11_CountOfLowerAndUpper {

	public static void main(String[] args) {


		String s="Ganesh Yadav";
		int lowerCount=0;
		int upperCount=0;
		for (int i = 0; i < s.length(); i++) 
		{
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z')
			{
				lowerCount++;
			}
			else if(ch>='A' && ch<='Z')
			{
				upperCount++;
			}
		}
		System.out.println(lowerCount);
		System.out.println(upperCount);
	}

}
