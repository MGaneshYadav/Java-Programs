package assignments;

public class PrintDuplicatesFromArray {

	public static void main(String[] args) {

		int a[]= {1,2,3,1,2,3,4,5,1,2,3,4};
		for (int i = 0; i < a.length; i++) 
		{
			int count=1;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					a[j]=0;
					count++;
				}
			}
			if(count>1 && a[i]!=0)
			{
				System.out.println(a[i]);
			}
		}
	}

}
