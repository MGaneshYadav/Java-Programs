package interviewQuestions;

public class ReplaceCharactersInString {

	public static void main(String[] args) {

		String s1="Manjula";
		String s2="";
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i)=='j' || s1.charAt(i)=='u')
			{
				s2=s2+'o';
			}
			else {
				s2=s2+s1.charAt(i);
			}
		}
		System.out.println(s2);
	}

}
