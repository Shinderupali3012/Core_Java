import java.util.Scanner;
public class CalculateTax{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float sal;
		double tax;
		System.out.println("Enter Salary");
		sal=sc.nextFloat();
		if(sal<=150000)
			tax=0;
		else if(sal>150000 && sal<300000)
			tax=(sal-150000)*0.20;
		else 
			tax=150000+(sal-300000)*0.30;

		System.out.println("tax is "+tax);
	}
	
}