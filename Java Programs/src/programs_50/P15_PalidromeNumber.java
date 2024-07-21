package programs_50;

public class P15_PalidromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1221;
		int temp=num;
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		if(temp==rev)
		{
			System.out.println("Palidrome");
		}
		else
		{
			System.out.println("Not a Palidrome");
		}

	}

}
