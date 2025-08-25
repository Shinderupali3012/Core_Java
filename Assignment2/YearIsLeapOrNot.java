import java.util.Scanner;
public class YearIsLeapOrNot{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year;
		System.out.println("Enter year to check year is leap or not");
		year=sc.nextInt();
		if(year%4==0 || year%400==0)
			System.out.println("year is leap");
		else 
			System.out.println("year is not leap");
	}
}
