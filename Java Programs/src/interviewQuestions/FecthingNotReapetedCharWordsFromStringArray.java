package interviewQuestions;

public class FecthingNotReapetedCharWordsFromStringArray {

	public static void main(String[] args) {
		
		String arr[]= {"apple","google","msit","orange","happy"};
		//op:{"msit","orange"}
		
		for(int i=0;i<arr.length;i++)
		{
			String s1=arr[i];
			int count=0;
			for(int j=0;j<s1.length();j++)
			{
				char ch=s1.charAt(j);
				for (int k=j+1;k<s1.length();k++) 
				{
					if(ch==s1.charAt(k))
					{
						count++;
						break;
					}
				}
			}
			if(count==0)
			{ 
				System.out.println(s1);
			}		
		}
	}
}
