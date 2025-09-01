import java.util.Scanner;
public class printEachDigitInWorld{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int no=sc.nextInt();
		int rev=0;
		while(no>0)
		{
			int rem=no%10;
			rev=rem+rev*10;
			no/=10;
			
		}
		while(rev>0)
		{
			int rem=rev%10;
			switch(rem)
			{
			case 1->System.out.println("one");
			case 2->System.out.println("two");
			case 3->System.out.println("three");
			case 4->System.out.println("four");
			case 5->System.out.println("five");
			case 6->System.out.println("six");
			case 7->System.out.println("seven");
			case 8->System.out.println("eight");
			case 9->System.out.println("nine");

			}
			rev/=10;
		}

	}
	
}