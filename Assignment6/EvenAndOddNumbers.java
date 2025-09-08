import java.util.Scanner;
public class EvenAndOddNumbers{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]={};
		int c[]={};
		int ecount,ocount;
		ecount=ocount=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				ecount++;
			}
			else 
			{
				ocount++;
			}
		}
		System.out.println("Display Original Array");
		Original(a);

		System.out.println("\nDisplay Even Array element");
		EvenNo(a,ecount);
		System.out.println("\nDisplay Odd Array element");
		OddNo(a,ocount);
	}
	public static void Original(int a[])
	{
		for(int X:a)
		{
			System.out.print(X+"\t");
		}
	}	

	public static void EvenNo(int a[],int evencount)
	{
		int b[]=new int[evencount];
		int i=0;
		for(int X:a)
		{
			if(X%2==0)
			{
				b[i]=X;
				System.out.print(b[i]+"\t");
				i++;
			}
		}
	}	
	public static void OddNo(int a[],int ocount)
	{
		int c[]=new int[ocount];
		int i=0;
		for(int X:a)
		{
			if(X%2!=0)
			{
				c[i]=X;
				System.out.print(c[i]+"\t");
				i++;
			}
		}
	}
	
	
}