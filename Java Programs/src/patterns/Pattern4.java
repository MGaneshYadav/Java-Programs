package patterns;

public class Pattern4 {
	
	public static void main(String[] args) 
	{

		for (int i = 1; i <=5; i++) 
		{
			char ch='A';
			for (int j = 1; j <=5; j++) 
			{
				System.out.print(ch+++" ");
			}
			System.out.println();
		}
	}

}
