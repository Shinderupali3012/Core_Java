import java.util.Scanner;
public class FindSumXToY{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x,y,sum=0;
		System.out.println("Enter x value");
		x=sc.nextInt();
		System.out.println("enter y value");
		y=sc.nextInt();
		for(int i=x;i<=y;i++)
			sum+=i;
		
		System.out.println("sum is "+sum);

	}
	
}