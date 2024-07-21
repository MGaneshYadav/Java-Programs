import java.util.HashSet;

public class RemoveDuplicatesFromArrayUsingHashSet {

	public static void main(String[] args) {
		
		int arr[]= {1,2,2,3,4,1,6};
		
		HashSet<Integer> h=new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			h.add(arr[i]);
		}
		
		System.out.println(h);

	}

}
