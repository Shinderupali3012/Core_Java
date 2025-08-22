// program-8
import java.util.Scanner;
public class EmployeeBasicsal
{
	public static void main(String[] args)
	{
		int id;
		float sal,rent,allowance,tax,homeSal;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id");
		id=sc.nextInt();
		System.out.println("Enter Employee Basic Slary");
		sal=sc.nextFloat();
		rent=sal*0.10f;
		allowance=sal*0.30f;
		tax=sal*0.5f;
		homeSal=sal+rent+allowance-tax;
		System.out.println("Employee Id Is :"+id);
		System.out.println("Employee Basic sal is :"+sal);
		System.out.println("Employee House Rent is "+rent);
		System.out.println("Employee Allowance is "+allowance);
		System.out.println("Employee tax is "+tax);
		System.out.println("Employee Home Rent is "+homeSal);
	}
}