import java.util.Scanner;
public class FindFactToNIndex{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fact=1;
		System.out.println("Enter base");
		int base=sc.nextInt();
		System.out.println("enter index");
		int index=sc.nextInt();
		for(int i=1;i<=index;i++)
		{
			fact*=base;
		}
		System.out.println("factorial is "+fact);
	}

}