// p-6
import java.util.Scanner;
public class FindSurfaceAreaAndVolumeOfCube
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int  l,b,h;
		float area,volume;
		System.out.println("enter length breath and height of cube");
		l=sc.nextInt();
		b=sc.nextInt();
		h=sc.nextInt();
		area=2*((l*b)+(l*h)+(b*h));
		System.out.println("Area of cube is "+area);
		volume=l*b*h;
		System.out.println("volume of cube is "+volume);
	}
}