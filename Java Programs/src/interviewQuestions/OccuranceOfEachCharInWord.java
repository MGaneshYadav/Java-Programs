package interviewQuestions;

public class OccuranceOfEachCharInWord {

	public static void main(String[] args) {

		String s1="Ganesh yadav";
		char ch1[]=s1.toCharArray();
		for (int i = 0; i < ch1.length; i++)
		{
			int count=1;
			for (int j = i+1; j < ch1.length; j++) 
			{
				if(ch1[i]==ch1[j])
				{
					
					ch1[j]='@';
					count++;
				}
			}
			if(ch1[i]!='@')
			System.out.println(s1.charAt(i)+"---->"+count);
			
		}
	}

}
