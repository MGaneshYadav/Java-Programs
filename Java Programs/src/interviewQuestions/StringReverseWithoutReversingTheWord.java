package interviewQuestions;

public class StringReverseWithoutReversingTheWord {

	public static void main(String[] args) {


		String s="i love programming very much";
		//op:much very programming love i 
		
		String[] s1=s.split(" ");
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");
		}
	}

}
