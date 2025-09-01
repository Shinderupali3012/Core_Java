import java.util.Scanner;
public class NumberDigit{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		System.out.println("digit is \n");
		while(no>0)
		{
			int rem=no%10;
			no/=10;
			System.out.print("\t "+rem);
		}
	}
	
}