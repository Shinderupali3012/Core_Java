// program-10
import java.util.Scanner;
public class FindDistance{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double x1,x2,y1,y2;
		double distance;
		System.out.println("Enter cordinate of frist point");
		x1=sc.nextDouble();
		y2=sc.nextDouble();
		System.out.println("Enter cordinate of second point");
		y1=sc.nextDouble();
		x2=sc.nextDouble();
		distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println("distance is"+distance);
	}
}