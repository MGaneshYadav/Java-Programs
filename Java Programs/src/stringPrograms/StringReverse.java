package stringPrograms;

import java.util.Iterator;

public class StringReverse {

	public static void main(String[] args) {

		String s1="i am from bangalore";
		String arr[]=s1.split(" ");
		String rev="";
		String s2="from";
		for (int i = 0; i < arr.length; i++) 
		{
			if(s2.equals(arr[i]))
			{
				String s3=arr[i].toString();
				for (int j = s3.length()-1;j>=0; j--) 
				{
					rev=rev+s3.charAt(j);
				}
				rev=rev+" ";
			}
			else
			{
			     rev=rev+arr[i]+" ";
			}
		}
		
		System.out.println(rev);
	}

}
