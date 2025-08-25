import java.util.Scanner;
public class CompareTwoNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no1,no2;
		System.out.println("Enter 1st number");
		no1=sc.nextInt();
		System.out.println("Enter 2nd number");
		no2=sc.nextInt();
		if(no1<no2)
			System.out.println("no2 is greater");
		else if(no1>no2)
			System.out.println(" no1 is greater");
		else
			System.out.println("both are equals");
	}
	
}