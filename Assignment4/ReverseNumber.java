import java.util.Scanner;
public class ReverseNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rev=0,rem;
		System.out.println("enter a number");
		int no=sc.nextInt();
		while(no>0)
		{
			rem=no%10;
			rev=rem+rev*10;
			no/=10;

		}
		System.out.println("reverse number is "+rev);
	}
	
}