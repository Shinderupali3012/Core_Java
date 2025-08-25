import java.util.Scanner;

public class LiberyFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("late days number ");
        int days = sc.nextInt();
        int fine = 0;
        if (days > 0 && days <= 5) {
            fine = days * 2;  
        }
         else if (days >= 6 && days <= 10) {
            fine = days * 3;  
        }
         else if (days > 10) {
            fine = days * 5; 
        }
        if (days <= 0) 
            System.out.println("no fine");
        
        else 
            System.out.println("Fine  is = " + fine);
        
    }
}
