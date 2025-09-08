import java.util.Scanner;
public class SortArray{
	public static void main(String args[])
	{
	 	Scanner sc=new Scanner(System.in);
	 	System.out.println("enter N: ");
	 	int n=sc.nextInt();
	 	int a[]=new int[n];
	 	System.out.println("enter array elemnt");
	 	for(int i=0;i<n;i++)
	 	{
	 		 a[i]=sc.nextInt();
	 	}
	 	System.out.println("before Swapping");
	 	Display(a);
	 	Sort(a,n);
	 	System.out.println("\nafter swapping");
	 	Display(a);
	}
	public static void Display(int a[])
	{
		for(int X:a)
		{
			System.out.print(X+"\t");
		}
	}
	public static void Sort(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
}