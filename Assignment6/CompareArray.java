import java.util.Scanner;
public class CompareArray{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size for 1st array ");
		int n=sc.nextInt();
		System.out.println("enter size for 2nd array ");
		int n1=sc.nextInt();
		int flag=0;
		int a[]=new int[n];
		int b[]=new int[n1];
		System.out.println("enter 1st array elemnts");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter 2nd array elements");
		for(int i=0;i<n1;i++)
		{
			b[i]=sc.nextInt();
		}
		Compare(a,b,n,n1);
	}
	public static void Compare(int a[],int b[],int n,int n1)
	{
		int flag=0;
		if(n==n1)
		{
			for(int i=0;i<n;i++)
			{
				if(a[i]==b[i])
				{
					flag=1;
				}
				else
				 {
				 	flag=0;
				 	break;
				 }
			}
		}
		if(flag==1)
		{
			System.out.println("identity matrix");
		}
		else
		{
			System.out.println("not identity matrix");
		}
	}
}