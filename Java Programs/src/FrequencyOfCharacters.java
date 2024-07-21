import java.util.Arrays;
import java.util.HashMap;

public class FrequencyOfCharacters {

	public static void main(String args[])
	{
		int arr[]= {1,2,4,3,2,1,1};
		Arrays.sort(arr);
		
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			int n=arr[i];
			if(hm.containsKey(n))
			{
				hm.put(n, hm.get(n)+1);
			}
			else
			{
				hm.put(n,1);
			}
		}
		System.out.println(hm);
	}
}
