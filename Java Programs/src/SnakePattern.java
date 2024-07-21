
//abcd
//hgfe
//ijkl
//ponm

public class SnakePattern {

	public static void main(String[] args) {

		char ch='a';
		for (int i = 0; i <=3; i++) 
		{
			if(i%2==0)
			{
				for (int j = 0; j <=3; j++) 
				{
					System.out.print(ch++);
				}	                                     
			}                                            
			else                                         
			{                                            
				ch=(char)(ch+3);
				char temp=(char)(ch+1);
				for(int j = 0; j <=3; j++) 
				{
					System.out.print(ch--);
				}
				ch=temp;
			}
			System.out.println();   
		}
	}
}





