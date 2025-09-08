import java.util.Scanner;
public class FindOccurence{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter array element ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter key for search");
		int key=sc.nextInt();
		System.out.println("display array elemnt ");
		Display(a);
		Occurence(a,n,key);
	}
	public static void Display(int a[])
	{
		for(int X:a)
		  System.out.print(X+"\t");
	}
	public static void Occurence(int a[],int n,int key)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			   if(a[i]==key)
			      count++;
			
			
		}
		System.out.println("occurence of"+key +"element is "+count);
	}
}
