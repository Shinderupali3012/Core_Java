import java.util.Scanner;
public class SumOfDigit{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		int count=0,sum=0;
		System.out.println("digit is \n");
		while(no>0)
		{
			int rem=no%10;
			no/=10;
			System.out.print("\t"+rem);
			sum+=rem;
			count++;
		}
		System.out.println("\ntotal digit is "+count);
		System.out.println("sum of digit is "+sum);
	}
	
}