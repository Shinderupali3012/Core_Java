// p-4
import java.util.Scanner;
public class FindVelocityAndDistance
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int u,a,t,v,s;
		System.out.println("enter Velocity");
		u=sc.nextInt();
		System.out.println("enter Acceleration");
		a=sc.nextInt();
		System.out.println("Enter time");
		t=sc.nextInt();
		v=u+(a*t);
		System.out.println("velocity is "+v);
		s=u+a*t*t;
		System.out.println("distance is "+s);
	}
}