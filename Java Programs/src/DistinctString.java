
public class DistinctString {
	public static void main(String args[])
	{
		String str="Doodle";
		String str2="";
		String[] str1 = str.split("");
		for(int i=0;i<str1.length;i++)
		{
			String ch=str1[i];
			for(int j=i+1;j<=str1.length;j++)
			{
				if(str2.contains(ch))
				{
					continue;
				}
				else
				{
					str2+=ch;
				}
			}
		}
		System.out.println(str2);
		
		
	}

}
