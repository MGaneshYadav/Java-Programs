package interviewQuestions;

public class SquareTheDigitInArrayAndArrangeInAscendingOrder {

	public static void main(String[] args) {

		int a[]= {-4,-1,0,3,10};
		//op: [0,1,9,16,100]
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=a[i]*a[i];
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>=a[j])
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
