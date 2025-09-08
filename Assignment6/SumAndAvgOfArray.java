import java.util.Scanner;

public class SumAndAvgOfArray{
	public static void main(String args[]){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter N : ");
	 int n=sc.nextInt();
	 int a[]=new int[n];
	 for(int i=0;i<n;i++)
	 {
	 	a[i]=sc.nextInt();
	 }
	 Display(a,n);
	 DisplaySumAndAvg(a,n);

	}
	public static void Display(int a[],int n)
	{
		for(int X:a)
		{
			System.out.print("\t "+X);
		}
	}
	public static void DisplaySumAndAvg(int a[],int n)
	{
		int sum=0;
		for(int X:a)
		{
			sum+=X;
		}
		float avg=sum/n;
		System.out.println("\nSum is"+sum);
		System.out.println("AVg is "+avg);
	}
}