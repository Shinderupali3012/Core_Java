import java.util.Scanner;
public class CountEvenOddZeroDigit{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		int ecount=0,ocount=0,count=0,total=0;
		System.out.println("digit is \n");
		while(no>0)
		{
			int rem=no%10;
			
			System.out.print("\t"+rem);
			if(rem==0)
			  count++;
			else if(rem%2==0)
				ecount++;
			else
				ocount++;
			no/=10;
			total++;

		}
		System.out.println("\ntotal digit is "+total);
		System.out.println("Total zero Digit is "+count);
		System.out.println("total even number digit is "+ecount);
		System.out.println("total odd number digit is "+ocount );
	}
	
}