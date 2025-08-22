// program-13
import java.util.Scanner;
public class DisplayASCIIValue{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Character");
		char ch=sc.next()..charAt(0);
		System.out.println("ASCII value is "+(int)(ch));
	}
	
}