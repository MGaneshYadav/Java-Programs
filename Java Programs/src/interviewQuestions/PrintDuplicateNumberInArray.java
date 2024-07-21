package interviewQuestions;

public class PrintDuplicateNumberInArray {

	public static void main(String[] args) {

		int a[]= {11,12,13,11,15};
		//op:11
		
		for (int i = 0; i < a.length; i++) {
			
			int count=1;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(a[i]);
			}
		}
	}

}
