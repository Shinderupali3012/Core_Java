import java.util.Scanner;
public class CopyOneArrayToAnother{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\ndisplay 1st Array");
		 Display(a);
		 System.out.println("\n Display 2nd Array");
		 CopyArray(a,b,n);
		 DisplayArr(b);
	}
	public static void  Display(int a[])
	{
		for(int X:a)
		{
			System.out.print(X+"\t");
		}
	}
	public static void CopyArray(int a[],int b[],int n)
	{
		for(int i=0;i<n;i++)
		{
			b[i]=a[i];
		}
	}
	public static void DisplayArr(int b[])
	{
		for(int X:b)
		{
			System.out.print(X+"\t");
		}
	}
}