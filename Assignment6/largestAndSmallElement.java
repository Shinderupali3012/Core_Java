import java.util.Scanner;
public class largestAndSmallElement{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		int min=a[0];
		System.out.println("display array elemnts : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");
			if(a[i]>max)
			{
				max =a[i];
			}
			else if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("largest element of arrray is "+max);
		System.out.println("Smallest element of arrray is "+min);

	}
	
}