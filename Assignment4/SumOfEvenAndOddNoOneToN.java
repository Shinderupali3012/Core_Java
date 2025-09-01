import java.util.Scanner;
public class SumOfEvenAndOddNoOneToN{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,esum=0,osum=0;
		System.out.println("enter n value");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
				esum+=i;
			else 
				osum+=i;
		}
		System.out.println("odd number sum is "+osum);
		System.out.println("even number sum is "+esum);

	}
}

	
