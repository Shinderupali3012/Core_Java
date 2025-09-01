import java.util.Scanner;
public class FactorOfNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a nunber");
		int no=sc.nextInt();
		System.out.println("factor is \n");
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				System.out.print("\t"+i);
			}
		}
	}
	
}