import java.util.Scanner;
public class OneToNPrimeNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		int flag=0;
		System.out.println("prime number are\n");
		for(int i=2;i<=n;i++)
		{
			flag=0;
			for (int j=2;j<i;j++) {
				if(i%j==0)
				{
					flag=1;
				}
				
			}
			if(flag==0)
			{
				System.out.print("\t"+i);
			}
		}
	}
}

