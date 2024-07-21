package interviewQuestions;

import java.util.Iterator;

public class SortArrayInAcendingOrder {

	public static void main(String[] args) {

		int a[]= {0,0,1,2,0,3};
		//op: 0,0,1,2,0,3
		
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
