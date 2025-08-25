import java.util.Scanner;
public class CheckDigitOrCharacter{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character");
		char ch=sc.next().charAt(0);
		if(ch>=48 &&ch<=58 )
			System.out.println("charcter is digit "+ (int)(ch));
		else if(ch>=65 && ch<=90)
			System.out.println("charcter is upperCase : "+(char)(ch));
		else
			System.out.println("charcater is lowercase : "+(char)(ch));
	}
	
}