
import java.util.Scanner;
public class NoIsPositive{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no;
		System.out.println("Enter a number");
		no=sc.nextInt();
		if(no>0)
			System.out.println("number is positive");
	}
}