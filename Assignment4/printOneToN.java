import java.util.Scanner;
public class printOneToN{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int i=1,n;
		n=sc.nextInt();
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
	}
}