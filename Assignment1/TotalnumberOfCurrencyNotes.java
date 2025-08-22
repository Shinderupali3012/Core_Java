// program No-9
import java.util.Scanner;
public class TotalnumberOfCurrencyNotes
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int amount;
		int ten,five,one;
		System.out.println("enter Withdrawn amount");
		amount=sc.nextInt();
		ten=amount/10;
		amount=amount%10;
		five=amount/5;
		amount%=5;
		one=amount;
		System.out.println("tens notes are "+ten);
		System.out.println("fives notes are"+five);
		System.out.println("one note is"+one);
	}
}