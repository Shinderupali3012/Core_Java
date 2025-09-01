import java.util.Scanner;
public class ArthematicOperation{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int no1=sc.nextInt();
		System.out.println("Enter operator");
		char op=sc.next().charAt(0);
		System.out.println("Enter 2nd number");
		int no2=sc.nextInt();
		switch(op)
		{
			case '+'->System.out.println("Addition "+(no1+no2));
			case '-'->System.out.println("Substraction "+(no1-no2));
			case '*'->System.out.println("Multification "+(no1*no2));
			case '/'->System.out.println("division "+(no1/no2));

		}

	}
}