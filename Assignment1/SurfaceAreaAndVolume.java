// p-2
import java.util.Scanner;
public class SurfaceAreaAndVolume
{
	 public static void main(String[] args)
	 {
		Scanner sc=new Scanner(System.in);
		double area,Volume;
		float r,h,PI;
		System.out.println("Enter Radius of circle");
		r=sc.nextFloat();
		System.out.println("ENter Dimession of circle");
		h=sc.nextFloat();
		area=2*Math.PI*r*r+2*Math.PI*r*h;
		System.out.println("Surface Area is  "+area);
		Volume=Math.PI*r*r*h;
		System.out.println("Volume of Surface is "+Volume);

	 }
}