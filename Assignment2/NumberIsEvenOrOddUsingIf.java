import java.util.Scanner;
public class NumberIsEvenOrOddUsingIf{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no;
		System.out.println("Enter a number");
		no=sc.nextInt();
		if(no%2==0)
			System.out.println("number is even");
		else
			System.out.println("number is odd");
	}
	
}