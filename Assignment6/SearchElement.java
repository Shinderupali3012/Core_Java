import java.util.Scanner;
public class SearchElement{
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
		System.out.println("enter search key ");
		int key=sc.nextInt();
		Display(a);
		int result=SearchKey(a,key);
		if(result >=1)
			System.out.println("key found"+result);
		else 
			System.out.println("key not found");
	}
	public static void Display(int a[])
	{
		for(int X:a)
			System.out.print(X+"\t");
	}
	public static int SearchKey(int a[],int key)
	{

		for(int X:a)
		{
			if(X==key)
				return key;
		}
		return -1;
	}
}