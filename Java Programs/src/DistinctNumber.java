
public class DistinctNumber {
	
	public static void main(String args[])
	{
		int num=121315436;
		int rem=0;
		String str="";
		while(num>0)
		{
			rem=num%10;
			String s=String.valueOf(rem);
			if(str.contains(s)) {
				num=num/10;
				continue;
			}
			else
			{
				str+=s;
			}
			num=num/10;
		}
		System.out.println(str);
	}

}
