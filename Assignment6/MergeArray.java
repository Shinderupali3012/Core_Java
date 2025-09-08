import java.util.Scanner;
public class MergeArray{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st array size  :");
		int n=sc.nextInt();
		System.out.println("enter 2nd array size  :");
		int n1=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n1];
		int n2=n+n1;
		int c[]=new int[n2];
		int count=0;
		System.out.println("enter 1st array element");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			c[count]=a[i];
			count++;
		}
		System.out.println("enter 2nd array element");
		for(int i=0;i<n1;i++)
		{
			b[i]=sc.nextInt();
			c[count]=b[i];
			count++;
		}
		System.out.println("Display 3rd array");
		for(int i=0;i<n2;i++)
		{
			for(int j=0;j<n2;j++)
			{
				if(c[i]<c[j])
				{
					int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
			    }
			}
		}
		for(int X:c)
		{
			System.out.print(X+"\t");
		}
	}
}