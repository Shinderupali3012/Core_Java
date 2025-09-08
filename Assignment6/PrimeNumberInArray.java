import java.util.Scanner;
public class PrimeNumberInArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("display prime Array");
		Prime(a,n);

	}
	public static void Prime(int a[],int n)
	{
		int flag=0,k=0;
		int p[]=new int[n];
		for(int i=0;i<n;i++)
		{
			if(a[i]!=1)
			{	
				flag=0;
				for(int j=2;j<=a[i]/2;j++)
				{
					 if(a[i]%j==0)
						flag=1;			
				}
				if(flag==0)
				{
					p[k]=a[i];
					System.out.print(p[k]+"\t");
					k++;
				}
		    }
		}
	}
}