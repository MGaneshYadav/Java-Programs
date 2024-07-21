package interviewQuestions;

public class StringReverseWithSameSpaces {

	public static void main(String[] args) {
		
		String str="my name is ganesh yadav";
		//Op: va dayh se nagsie manym
			
		String rev="";
		String rev2="";
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)==' ')
			{
				continue;
			}
			else
			{
				rev=rev+str.charAt(i);
			}	
		}
		System.out.println(rev);
		for (int i = 0; i < str.length(); i++) 
		{
			if(str.charAt(i)==' ')
			{
				rev2=rev2+' ';
			}
			else
			{
				//rev2=rev2+rev[i];
			}
		}
	}
}
