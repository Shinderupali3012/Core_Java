import java.util.Scanner;
public class NumberIsEvenOrOddUsingConditionOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        System.out.println("Enter a number");
        no = sc.nextInt();

        String result = (no % 2 == 0) ? "Number is even" : "Number is odd";
        System.out.println(result);
    }
}
