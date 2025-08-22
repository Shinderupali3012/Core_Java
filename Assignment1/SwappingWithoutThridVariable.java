// p-7
import java.util.Scanner;
public class SwappingWithoutThridVariable
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the value of two number");
		a=sc.nextInt();
		b=sc.nextInt();
		// a=a+b;
		// b=a-b;
		// a=a-b;
		a=a*b;
		b=a/b;
		a=a/b;

		System.out.println(" After swapping a="+a);
		System.out.println("b="+b);
	}
}