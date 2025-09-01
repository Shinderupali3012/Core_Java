import java.util.Scanner;
public class FindFactoail{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fact=1;
		System.out.println("Enter number");
		int n=sc.nextInt();
		for(int i=n;i>=2;i--)
		{
			fact*=i;
		}
		System.out.println("factorial is "+fact);
	}

}