package assignments;

public class RightRotationByTwoPositions {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5};
		int op[]=new int[a.length];
		for (int i =0 ; i < op.length; i++) 
		{
			int k=a.length-2;
			op[i]=a[k];
		}
		for (int i = 0; i < op.length; i++) 
		{
			System.out.println(op[i]);
		}
		
	}

}
