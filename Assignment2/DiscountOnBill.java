import java.util.Scanner;

public class DiscountOnBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qty1, qty2, qty3;
        double rate1, rate2, rate3;
        System.out.print("Enter quantity and rate for item 1: ");
        qty1 = sc.nextInt();
        rate1 = sc.nextDouble();
        System.out.print("Enter quantity and rate for item 2: ");
        qty2 = sc.nextInt();
        rate2 = sc.nextDouble();

        System.out.print("Enter quantity and rate for item 3: ");
        qty3 = sc.nextInt();
        rate3 = sc.nextDouble();
        double total = (qty1 * rate1) + (qty2 * rate2) + (qty3 * rate3);
        double discount = 0;
        if (total > 10000) {
            discount = total * 0.20;
        }
         else if (total >= 5000) {
            discount = total * 0.15;
        }
         else if (total >= 2000) {
            discount = total * 0.08;
        } 
        else {
            discount = 0;
        }

        double amount = total - discount;
        System.out.println("Total Amount : " + total);
        System.out.println("Discount     : " + discount);
        System.out.println("Net pay  : " + amount);
    }
}
