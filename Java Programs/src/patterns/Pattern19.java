package patterns;

public class Pattern19 {

	
//	1 @ # *
//	@ 2 @ #
//	# @ 3 @
//	* # @ 4

	public static void main(String[] args) 
	{
		int k=1;
		for (int i = 1; i <=4; i++) 
		{
			
			for (int j = 1; j <=4; j++) 
			{
				if(i==j)
				{
				   System.out.print(k+++" ");
				}
				else if(i+j==5)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
