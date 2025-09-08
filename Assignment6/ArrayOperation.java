import java.util.Scanner;
public class ArrayOperation{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		while(true)
		{ 
			System.out.println("""
			1.display
			2. Average of ArrayOperation
			3.max
			4.search elements
			5.Occurenece
			enter choice""");
			int ch=sc.nextInt();
		
			switch(ch)
			{
				case 1->{
					System.out.println("display array element");
					Display(a);
				}
				case 2->{
					Average(a,n);
				}
				case 3->{
					Max(a);
				}
				case 4->{
					System.out.println("enter search key");
					int key=sc.nextInt();
					Boolean b =Search(a,key);
					if(b)
						System.out.println("key found");
					else 
						System.out.println("key not found");
				}
				case 5->{
					System.out.println("enter key for occurence");
					int key=sc.nextInt();
					
					System.out.println("element occur in array "+FindOccurence(a,key)+" time");

				}
				case 6->{
					System.exit(0);
				}
				case 7->{
					System.out.println("invalid choice");
				}

			}
		}
	}
	public static void  Display(int a[])
	{
		for(int X:a)
		{
			System.out.print(X+"\t");
		}
	}
	public static void  Average(int a[],int n)
	{
		int sum=0;
		for(int X:a)
		{
			sum+=X;
		}
		float avg=sum/n;
		System.out.println("Average is "+avg);

	}
	public static void Max(int a[])
	{
		int max=0;
		for(int X:a)
		{
			if(X>max)
				max=X;
		}
		System.out.println("max is "+max);
	}
	public static boolean Search(int a[],int key)
	{
		for(int X:a)
		{
			if(X==key)
			{
				return true;
			}

		}
		return false;
	}
	public static int FindOccurence(int a[],int key)
	{
		int count=0;
		for(int X:a)
		{
			if(key==X)
				count++;
		}
		return count;
	}
	
}