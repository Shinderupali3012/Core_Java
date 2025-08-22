// p-7
import java.util.Scanner;
public class SwappingUsingThridVariable
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the value of two number");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println(" After swapping a="+a);
		System.out.println("b="+b);
	}
}