import java.util.Scanner;
public class RemoveDuplicate{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=sc.nextInt();
		int a[]=new int[10];
		Accept(a,n);
		System.out.println("after removing");
		int index=Remove(a,n);
		Display(a,index);
	}
	public static void Accept(int a[],int n)
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
	}	
    public static int Remove(int a[],int n)
    {
    	for(int i=0;i<n;i++)
    	{
    		for(int j=i+1;j<n;)
			{
				if(a[i]==a[j])
				{
					for(int k=j;k<n-1;k++)
					{
						a[k]=a[k+1];
					}
					n--;
				}
				else
				{
					j++;
				}
			}

    	}

    	return n;
    }
    public static void Display(int a[],int index)
	{
		for(int i=0;i<index;i++)
		{
			System.out.print(a[i]+"\t");
		}
	}
	
}