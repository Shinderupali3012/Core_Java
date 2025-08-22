// p-5
import java.util.Scanner;
public class ArithemeticAndHarmonicMean
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		float Am,Hm;
		System.out.println("Enter two number");
		a=sc.nextInt();
		b=sc.nextInt();
		Am=(a+b)/2;
		System.out.println("Arithemetic mean is"+Am);
		Hm=a*b/(a+b);
		System.out.println("Harmonic mean is"+Hm);
	}
}