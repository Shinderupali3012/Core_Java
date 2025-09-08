import java.util.Scanner;
public class SecondLargestAndSmallest{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter array element");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Sort(a,n);
		System.out.println("enter index for find higest element");
		int key=sc.nextInt();
		FindHigest(a,n,key);
		int min=a[0];
		Min(a,min);
	}
	public static void Sort(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}	
	}
	public static void FindHigest(int a[],int n,int key)
	{
		int count=0;
		for(int i=0;i<n-1;i++)
		{
			if(a[i]!=a[i+1])
				count++;
			 if(count==key)
				System.out.println(key+" largest element is "+a[count-1]);	
		}
		System.out.println(key+"largest element is "+a[n-1]);
		
	}
	public static void Min(int a[],int min)
	{
		for(int X:a)
		{
			if(X<min)
				min=X;
		}
		System.out.println("Smallest element is "+min);
	}

}