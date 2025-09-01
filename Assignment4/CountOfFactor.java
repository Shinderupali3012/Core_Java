import java.util.Scanner;
public class CountOfFactor{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a nunber");
		int no=sc.nextInt();
		int count=0;
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				count++;
			}
		} 
		System.out.println("Count is "+count);
	}
	
}