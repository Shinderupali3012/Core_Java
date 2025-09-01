import java.util.Scanner;

import java.util.Scanner;
public class OneToNArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Armstrong numbers: ");

        for (int i = 1; i <= n; i++) {
            int temp = i;
            int count = 0;
            int no = temp;
            while (no > 0) {
                count++;
                no/= 10;
            }
            int sum = 0;
            no = temp;
            while (no > 0) {
                int rem = no % 10;
                int pow = 1;
                for (int j = 1; j <= count; j++) {
                    pow *= rem;
                }

                sum += pow;
                no /= 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}
