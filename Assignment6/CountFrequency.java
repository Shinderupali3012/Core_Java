import java.util.Scanner;
public class CountFrequency{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();

		}
		System.out.println("\ndisplay array before sorting");
		Display(a);
		Sort(a,n);
		System.out.println("\ndisplay after sorting");
		Display(a);
		System.out.println("\ndisplay frequency of array element");
		Count(a,n);
	}
	public static  void Display(int a[])
	{
		for(int X:a)
			System.out.print(X+"\t");
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
	public static void Count(int a[],int n)
	{
		int count=1;
		for(int i=0;i<n-1;i++)
		{
			if(a[i]==a[i+1])
				count++;
			else
			{ 
				System.out.println(a[i]+"--->"+count);
				count=1;
			}	

		}
		System.out.println(a[n-1]+"--->"+count);
	}
}