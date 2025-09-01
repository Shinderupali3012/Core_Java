import java.util.Scanner;
public class AreaMenuDrivernProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        float r = sc.nextFloat();
        while(true)
        {
            System.out.println("""
                1. Find Circle Area 
                2. Circumference of Circle
                3. Volume of Sphere 
                Enter choice:
                """);

            int ch = sc.nextInt();
      
            switch (ch) {
                case 1 -> {
                    double area = Math.PI * r * r;
                    System.out.println("Area of circle is " + area);
                }
            case 2-> {
                double Circumference=2*Math.PI*r*r;
                System.out.println("Circumference is "+Circumference);
            }
            case 3 -> {
                double volume = (4.0 / 3.0) * Math.PI * r * r * r;
                System.out.println("volume of sphere is "+volume);
            }
        }
        }
    }
}
