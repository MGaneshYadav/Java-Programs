import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if(a.length()==b.length())
        {
            String a1=a.toLowerCase();
            String b1=b.toLowerCase();
            char ch1[]=a1.toCharArray();
            char ch2[]=b1.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            boolean flag=true;
            for(int i=0;i<ch1.length;i++)
            {
                if(ch1[i]!=ch2[i])
                {
                    flag=false;
                }
            }
            if(flag==true)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}