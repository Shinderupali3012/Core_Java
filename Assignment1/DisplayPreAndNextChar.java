// p-12
import java.util.Scanner;
public class DisplayPreAndNextChar{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
        System.out.println("ENter character");
        ch=sc.next().charAt(0);

        System.out.println("next character is "+(char)(ch+1));
        System.out.println("prevese character is "+(char)(ch-1));

	}
}