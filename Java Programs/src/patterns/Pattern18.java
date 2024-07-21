package patterns;

public class Pattern18 {
	
public static void main(String[] args) {
		
		for (int i = 1; i <=5; i++) 
		{
			int k=1;
			char ch='A';
			for (int j = 1; j <=5; j++) 
			{
				if(i==j)
				{
				   System.out.print("@ ");
				}
				else if(i>=j)
				{
					System.out.print(k+++" ");
				}
				else
				{
					System.out.print(ch+++" ");
				}
			}
			System.out.println();
		}
		
	}

}
