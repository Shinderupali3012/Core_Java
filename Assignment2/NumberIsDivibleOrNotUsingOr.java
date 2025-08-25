import java.util.Scanner;
public class NumberIsDivibleOrNotUsingOr{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no;
		System.out.println("Enter a number");
		no=sc.nextInt();
		if(no%7==0 && no%5==0)
		{
		  if(no%7==0 ||no%5==0)
			System.out.println("number divisible by 7 and 5");
		}
		else if(no%5==0)
			System.out.println("number divisible by 5");
		else if(no%7==0)
			System.out.println("number divisible by 7");
		else
			System.out.println("number not divisible by 5 and 7");
	}
}