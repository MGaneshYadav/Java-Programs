package assignments;

public class RemoveSpacesFromStringFirstAndLast {

	public static void main(String[] args) {

//		String input="  Ganesh Yadav Mekala  ";
//		int start=0;
//		int end=input.length()-1;
//		while(start<=end)
//		{
//			if(input.charAt(start)==' ') 
//			{
//				start++;
//			}
//			else
//			{
//				break;
//			}
//		}
//		while(end>=start)
//		{
//			if(input.charAt(end)==' ')
//			{
//				end--;
//			}
//			else
//			{
//				break;
//			}
//		}
//		String output=input.substring(start,end+1);
//		System.out.println(output);
		
		
		String input="  Ganesh Yadav Mekala  ";
		int start=0;
		int end=input.length()-1;
		while(input.charAt(start)==' ' && start<=end)
		{
			start++;
		}
		while(input.charAt(end)==' ' && start<=end)
		{
			end--;
		}
		String output=input.substring(start,end+1);
		System.out.println(output);

	}

}
