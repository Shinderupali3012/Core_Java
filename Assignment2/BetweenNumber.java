import java.util.Scanner;
public class BetweenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no1, no2, no3;
        System.out.println("Enter first number");
        no1 = sc.nextInt();
        System.out.println("Enter second number");
        no2 = sc.nextInt();
        System.out.println("Enter third number");
        no3 = sc.nextInt();

        if ((no1 > no2 && no1 < no3) || (no1 > no3 && no1 < no2)) {
            System.out.println("Mid number is " + no1);
        } else if ((no2 > no1 && no2 < no3) || (no2 > no3 && no2 < no1)) {
            System.out.println("Mid number is " + no2);
        } else {
            System.out.println("Mid number is " + no3);
        }
    }
}
