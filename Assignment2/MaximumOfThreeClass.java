import java.util.Scanner;
public class MaximumOfThreeClass{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no1,no2,no3;
		System.out.println("Enter 1st number");
		no1=sc.nextInt();
		System.out.println("enter 2nd number");
		no2=sc.nextInt();
		System.out.println("enter 3rd number");
		no3=sc.nextInt(); 
		// if(no1>no2 && no1>no3)
			// System.out.println("no1 is greater");
		// else if(no2>no1 && no2>no3)
			// System.out.println("no2 is greater");
		// else
			// System.out.println("no3 is greater");
		int max = (no1 > no2) ? ( (no1 > no2) ? no1 : no2 ) : ( (no2> no3) ? no2 : no3 );
		System.out.println("greater number is "+max);
	}
}