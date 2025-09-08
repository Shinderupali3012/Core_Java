import java.util.Scanner;
public class ReverseArray{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array before reverse");
		Display(a);
		System.out.println("\nDisplay array after reverse");
		 Reverse(a,n);
		 Display(a);
	}
	public static void Display(int a[])
	{
		for(int X:a)
		{
			System.out.print(X+"\t");
		}

	}
	public static void Reverse(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			int temp=a[n-1];
			a[n-1]=a[i];
			a[i]=temp;
			n--;
		}
	}

}