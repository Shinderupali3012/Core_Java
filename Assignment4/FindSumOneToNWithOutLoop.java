import java.util.Scanner;
public class FindSumOneToNWithOutLoop{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter n value");
		int n=sc.nextInt();
		int sum=n*(n+1)/2;
		
		System.out.println("sum is "+sum);

	}
	
}