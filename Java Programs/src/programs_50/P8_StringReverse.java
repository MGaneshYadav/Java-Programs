package programs_50;

public class P8_StringReverse {

	public static void main(String[] args) {


		String s1="Hello I am a good boy";
		String s2="";
		String[] ch=s1.split(" ");
		for (int i = ch.length-1;i>=0 ;i--) 
		{
			s2=s2+ch[i]+" ";
		}
		System.out.println(s2);
	}

}
