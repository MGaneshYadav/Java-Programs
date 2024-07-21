
public class MaximumOccuredCharacterInString {

	public static void main(String[] args) {


		String s="Google the Doodle";
		char c=' ';
		int max=0;
		for (int i = 0; i < s.length(); i++) 
		{ 
			int count=1;
			char ch=s.charAt(i);
            
			for (int j = i+1; j < s.length(); j++) 
			{
				if(ch==s.charAt(j))
				{
					count++;
				}	
			}
			if(count>max)
			{
				c=ch;
				max=count;
			}
		}
		System.out.println(c+"-->"+max);
	}

}
