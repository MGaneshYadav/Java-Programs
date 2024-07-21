
public class FindingMissingNumber {

	public static void main(String[] args) {


		int arr[]= {1,3,5,2,8,4,7,9};
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
//		for (int i = 0; i < arr.length; i++) 
//		{
//			System.out.println(arr[i]);
//		}
		
		int n=arr[arr.length-1];
		int sum1=n*(n+1)/2;
		int sum2=0;
		for (int i = 0; i < arr.length; i++)
		{
			sum2=sum2+arr[i];
		}
		System.out.println("Missing number is : "+(sum1-sum2));
		
//		for (int i = 0; i < arr.length; i++)
//		{
//			if(arr[i]==i+1)
//			{
//				continue;
//			}
//			else
//			{
//				System.out.println(i+1);
//				break;
//			}
//		}
		
	}

}
