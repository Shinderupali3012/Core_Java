import java.util.Scanner;
public class VovelOrConsonant{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("Enter Character");
		ch=sc.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			System.out.println("Character is vovel");
		else 
			System.out.println("character is Consonant");
	}
}