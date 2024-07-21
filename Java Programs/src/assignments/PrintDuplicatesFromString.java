package assignments;

public class PrintDuplicatesFromString {

	public static void main(String[] args) {

		String s="testyantra";
		char[] ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			int count=1;
			for (int j = i+1; j < ch.length; j++) 
			{
				if(ch[i]==ch[j])
				{
					ch[j]='@';
					count++;
				}
			}
			if(count>1 && ch[i]!='@')
			{
				System.out.println(ch[i]);
			}
		}
	}
}
