package patterns;

public class Pattern13 {
	
	public static void main(String[] args) 
	{
		for (int i = 1; i <=4; i++) 
		{
			for (int j = 1; j <=3; j++) 
			{
				if(j==1)
				{
				   System.out.print(i+" ");
				}
				else if(j==3)
				{
					System.out.print(i+2+" ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
