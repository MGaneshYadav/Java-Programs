import java.util.LinkedHashMap;

public class CharacterOccuranceUsingLinkedHashMap {

	public static void main(String[] args) {
		
		
		String s="Cool Boys";
		LinkedHashMap<Character,Integer> lhm=new LinkedHashMap<Character,Integer>();
		
		for (int i = 0; i < s.length(); i++) 
		{
			char ch=s.charAt(i);
			if(lhm.containsKey(ch))
			{
				lhm.put(ch, lhm.get(ch)+1);
			}
			else
			{
				lhm.put(ch, 1);
			}
		}
		System.out.println(lhm);

	}

}
