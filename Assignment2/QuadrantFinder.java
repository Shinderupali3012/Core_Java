import java.util.Scanner;
public class QuadrantFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();
        if (x == 0 && y == 0) {
            System.out.println(" ORIGIN");
        }
         else if (x > 0 && y > 0) {
            System.out.println(" FIRST Quadrant");
        } 
        else if (x < 0 && y > 0) {
            System.out.println(" SECOND Quadrant");
        }
         else if (x < 0 && y < 0) {
            System.out.println(" THIRD Quadrant");
        } 
        else if (x > 0 && y < 0) {
            System.out.println(" FOURTH Quadrant");
        } 

    }
}
