import java.util.Scanner;
public class ArmstrongNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		int count=0,sum=0,rem,p=1;
		int temp=no;
		while(no>0)
		{
			 rem=no%10;
			count++;
			no/=10;
		}
		no=temp;
		while(no>0)
		{
			rem=no%10;
			p=1;
			for(int i=1;i<=count;i++)
			{
				p=p*rem;
				
			}
			sum+=p;
			no/=10;
		}

		if(sum==temp)
			System.out.println("Armstrong number");
		else 
			System.out.println("not armstrong");

		
	}
	
}
