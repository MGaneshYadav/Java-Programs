package stringPrograms;


public class CompressString {

	public static void main(String[] args) {

		//		String s="aaabbccc";
		//		String s2="";
		//		for (int i = 0; i < s.length(); i++) 
		//		{
		//			int count=1;
		//			char ch=s.charAt(i);
		//			for (int j = i+1; j < s.length(); j++) 
		//			{
		//				if(ch==s.charAt(j))
		//				{
		//					count++;
		//				}
		//			}
		//			
		//			if(s2.indexOf(ch)==-1)
		//			{
		//			   s2=s2+ch+""+count;
		//			}				
		//		}
		//		System.out.print(s2);


//		String s="aaabbccc";
//		char[] s2=s.toCharArray();
//		String s3="";
//		for (int i = 0; i < s2.length; i++) 
//		{
//			int count=1;
//			char ch=s2[i];
//			if(s2[i]=='@')
//			{
//				continue;
//			}
//			else
//			{
//				for (int j = i+1; j < s2.length; j++) 
//				{
//					if(ch==s2[j])
//					{
//						s2[j]='@';
//						count++;
//
//					}
//				}
//			}
//			s3=s3+ch+count;
//		}
//		System.out.print(s3);
		
		
		
		String str="aabbbbccaaaadfg";
		String str2="";
		for(int i=0;i<str.length();i++)
		{
			int count=1;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
				}
				else
				{
					i=j-1;
					break;
				}
			}
			if(count>1)
			{
				str2=str2+str.charAt(i)+count;
			}
			else
			{
				str2=str2+str.charAt(i);
			}
		}
		System.out.println(str2);
	}
}
