// p-3
import java.util.Scanner;
public class PrintTempInCelsiusAndKelvin
{
	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		 float C,F;
		 double K;
 		System .out.println("Enter Fahrenheit");
 		F=sc.nextFloat();
 		C=(5f/9)*(F-32);
 		System.out.println("Tempeture in Celsius is "+C);
 		K=C+273.15;
 		System.out.println("Tempeture in Kelvin is"+K);
	}
}