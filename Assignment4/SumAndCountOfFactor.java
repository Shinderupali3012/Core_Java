import java.util.Scanner;
public class SumAndCountOfFactor{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a nunber");
		int no=sc.nextInt();
		int count=0,sum=0;
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				sum+=i;
				count++;
			}
		} 
		System.out.println("sum is "+sum);
		System.out.println("Count is "+count);
	}
	
}