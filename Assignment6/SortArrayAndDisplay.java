import java.util.Scanner;
public class SortArrayAndDisplay{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		Accept(a,n);
		Sorting(a,n);
		Display(a);
	}
	public static void Accept(int a[],int n)
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
	}	
	public static void Sorting(int a[],int n)
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
	public static void Display(int a[])
	{
		for(int X:a)
		{
			System.out.println(X+"\t");
		}
	}

	
}