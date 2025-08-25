import java.util.Scanner;
public class TimeValidOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hour: ");
        int hour = sc.nextInt();
        System.out.print("Enter minute: ");
        int minute = sc.nextInt();
        System.out.print("Enter second: ");
        int second = sc.nextInt();
        if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60) {
            System.out.println("Logic 2: Time is VALID");
        } else {
            System.out.println("Logic 2: Time is NOT VALID");
        }
    }
}
