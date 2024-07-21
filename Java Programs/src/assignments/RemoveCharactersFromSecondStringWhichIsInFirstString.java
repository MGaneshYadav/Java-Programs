package assignments;

public class RemoveCharactersFromSecondStringWhichIsInFirstString {

	public static void main(String[] args) 
	{
		String s1="java";
		String s2="programming in java";
		String[] ch=s2.split(" ");
		String s3="";
		for (int i = 0; i <ch.length; i++) 
		{
			if(s1.equals(ch[i]))
			{
				continue;
			}
			else
			{
				s3=s3+ch[i]+" ";
			}
		}
		System.out.println(s3);
	}

}
