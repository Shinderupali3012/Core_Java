import java.util.Scanner;
public class OneToNPerfectNumber{
	public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter number");
	  int n=sc.nextInt();
	  int sum=0;
	  for(int i=1;i<=n;i++)
	  {
	  		sum=0;
	  		for(int j=1;j<i;j++)
	  		{
	  		     if(i%j==0)
	  		     {
	  		        sum+=j;
	  		     }
	  		}
	  		if(sum==i)
	  		{
	  			System.out.println("perfect number"+i);
	  		}
	  	
	  }
	}
}