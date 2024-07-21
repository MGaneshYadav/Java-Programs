import java.util.Scanner;

public class Employee {
	
	private int id;
	private String name;
	
	public Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public int getId() 
	{
		return id;	
	}
	public String getName()
	{
		return name;	
	}
	public void setName(String name)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int id=sc.nextInt();
		if(id==this.id)
		{
			if(!name.equals(""))
			{
		     this.name=name;
		     System.out.println("name changed successfully");
			}
			else
			{
				System.out.println("enter a valid name");
			}
		}
	}
}

