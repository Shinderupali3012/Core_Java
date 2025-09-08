import java.util.Scanner;
public class DeleteElement{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n :");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter Array element ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Delete(a,n);
		System.out.println("Display Array");
		Display(a,n);
	}
	public static void  Delete(int a[],int n)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array index");
		int key=sc.nextInt();
		for(int i=key;i<n-1;i++)
		{
			a[i]=a[i+1];
		}
		
	}
	public static void Display(int a[],int n)
	{
		for(int i=0;i<n-1;i++)
		{

			System.out.print(a[i]+"\t");
		}
		
	}
}