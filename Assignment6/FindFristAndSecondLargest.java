import java.util.Scanner;
public class FindFristAndSecondLargest{
	public static void main(String args[])
	{
	 	Scanner sc=new Scanner(System.in);
	 	System.out.println("enter N: ");
	 	int n=sc.nextInt();
	 	int a[]=new int[n];
	 	System.out.println("enter array element");
	 	for(int i=0;i<n;i++)
	 	{
	 		 a[i]=sc.nextInt();
	 	}
	 	System.out.println("before Swapping");
	 	Sort(a,n);
	 	
	 System.out.println("1st greater element is "+a[0]);
	 System.out.println("2nd greater element is "+a[1]);
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
}