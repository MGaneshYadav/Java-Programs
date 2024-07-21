package patterns;

public class Pattern20 {

	public static void main(String[] args) {
		
		int k=2;
		for (int i = 1; i <=4; i++) 
		{
			int m=k;
			for (int j = 1; j <=4; j++) 
			{
				   System.out.print(m+++" ");
			}
			k++;
			System.out.println();
		}
	}

}
