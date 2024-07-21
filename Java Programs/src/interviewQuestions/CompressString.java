package interviewQuestions;

public class CompressString {

	public static void main(String[] args) {

		String s1="aabbbbccaaaadfg";
		//op:a2b4c2a4dfg

		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			int count=1;
			char ch=s1.charAt(i);
			s2=s2+ch;
			for(int j=i+1;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j)) 
				{
					count++;
				}
				else
				{
					if(count>1)
					{
						s2=s2+count;
					}
					i=j-1;
					break;
				}
			}
		}
		System.out.println(s2);
	}
}
