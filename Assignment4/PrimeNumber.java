import java.util.Scanner;
public class PrimeNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a nunber");
		int no=sc.nextInt();
		int flag=1;
		if(no<=1)
		   flag=0;
		else if(no==2 || no==3)
			flag=1;
		else if(no%2==0 ||no%3==0)
			flag=0;
		else {
			for(int i=5;i<=Math.sqrt(no);i+=6){
				if(no%i==0 || no%(i+2)==0){
					flag=0;
					break;
				}
			}
		}
		if(flag>0)
			System.out.println("prime number");
		else 
			System.out.println("not prime");

	}
}
	
