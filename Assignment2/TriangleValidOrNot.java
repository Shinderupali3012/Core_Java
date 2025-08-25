import java.util.Scanner;
public class TriangleValidOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter first side: ");
        a = sc.nextInt();
        System.out.print("Enter second side: ");
         b = sc.nextInt();
        System.out.print("Enter third side: ");
        c = sc.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("The triangle is VALID");
        } else {
            System.out.println("The triangle is NOT VALID");
        }
    }
}
