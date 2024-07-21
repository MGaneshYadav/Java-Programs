
public class EmployeeDriver {
		public static void main(String[] args) 
		{
			Employee emp=new Employee(101,"gana");
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			emp.setName("yadav");
			System.out.println(emp.getName());
					
		}
}
