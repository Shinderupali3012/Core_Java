// p-1
import java.util.Scanner;
public class AreaOfCircleAndCir
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        double area,Circumference;
        float r,PI;
        System.out.println("Enter Radius of Circle");
        r=sc.nextFloat(); 
        area=Math.PI*r*r;
        System.out.println("Area of Circle is "+area);
        Circumference=2*Math.PI*r;
        System.out.println("Circumference Of circle is"+Circumference);
     }
}
 