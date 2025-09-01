import java.util.Scanner;
public class PrintHelloNTime{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n;
		System.out.println("how many time you want to print hello");
		n=sc.nextInt();
		for (i=0; i<n;i++ ) {
			System.out.println("hello");
		}
	}
	
}