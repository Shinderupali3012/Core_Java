import java.util.Scanner;
public class PalidromeNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rev=0,rem,temp;
		System.out.println("enter a number");
		int no=sc.nextInt();
		temp=no;
		while(no>0)
		{
			rem=no%10;
			rev=rem+rev*10;
			no/=10;

		}
		if(rev==temp)
			System.out.println("Palidrome number");
		else 
			System.out.println("not palidrome number");
	}
	
}