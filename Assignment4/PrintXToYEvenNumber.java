import java.util.Scanner;
public class PrintXToYEvenNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x,y;
		System.out.println("print starting and ending value");
		x=sc.nextInt();
		y=sc.nextInt();
		while(x<=y)
		{
			if(x%2==0)
			System.out.println("even number : "+x);
			x++;
		}

	}
	
}