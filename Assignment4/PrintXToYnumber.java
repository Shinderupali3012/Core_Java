import java.util.Scanner;
public class PrintXToYnumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x,y;
		System.out.println("print starting and ending value");
		x=sc.nextInt();
		y=sc.nextInt();
		while(x<=y)
		{
			System.out.println(x);
			x++;
		}

	}
	
}