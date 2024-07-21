package assignments;

public class PrintRepeatedWordsInString {

	public static void main(String[] args) 
	{
		String s="hello hii bengaluru hii hello";
		String[] ch=s.split(" ");
		for (int i = 0; i < ch.length; i++) 
		{
			int count=1;
			for (int j = i+1; j < ch.length; j++) 
			{
				if(ch[i].equals(ch[j]))
				{
					ch[j]="@";
					count++;
				}
			}
			if(count>1 && ch[i]!="@")
			{
				System.out.println(ch[i]);
			}
		}
		
	}

}
