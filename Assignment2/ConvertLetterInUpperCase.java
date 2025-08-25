import java.util.Scanner;
public class ConvertLetterInUpperCase{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("enter a character");
		ch=sc.next().charAt(0);
		System.out.println("uppercase convertion of charcter is : "+(char)(ch-32));
	}
}