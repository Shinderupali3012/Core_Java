import java.util.Scanner;
public class FindSumOfXandYInclusive{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("enter starting  point");
		int x=sc.nextInt();
		System.out.println("enter ending point");
		int y=sc.nextInt();
			while(x<=y)
			{
				sum=sum+x;
				x++;
			}
			System.out.println("sum is "+sum);

	}
	
}