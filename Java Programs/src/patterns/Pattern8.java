package patterns;

public class Pattern8 {
	
	public static void main(String[] args) 
	{
		for (int i = 1; i <=5; i++) 
		{
			char ch='A';
			for (int j = 1; j <=5; j++) 
			{
				if(i>=j)
				{
				   System.out.print(ch+++" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
