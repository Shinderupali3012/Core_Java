import java.util.Scanner;
public class MenuDrivernProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x");
         int x=sc.nextInt();
         System.out.println("enter y");
         int y=sc.nextInt();
        while(true)
        {
            System.out.println("""
                1: Equality 
                2: Less Than 
                3: Quotient and Remainder
                4: Range 
                5: Swap 
                Enter choice:
                """);

            int ch = sc.nextInt();
            switch(ch)
            {
                 case 1 ->{
                    if(x==y)
                        System.out.println("x and y are eqals");
                    else 
                        System.out.println("x and y not equals");
                 }
             case 2 -> {
                if(x<y)
                    System.out.println("x is less than y");
                else 
                    System.out.println("y is less than x");
             }
             case 3 ->{
                   if(x!=0 && y!=0)
                   {
                     int quotient=x/y;
                     int rem=x%y;
                     System.out.println("quotient is "+quotient);
                     System.out.println("Remainder is "+rem);
                   }
                   else 
                    System.out.println("please enter valid number");
             }
             case 4 ->{
             System.out.println("enter a number");
             int no=sc.nextInt();
               if(no>=x && no<=y)
                System.out.println("number is lies between x and y");
                else 
                    System.out.println("number is not lies between x and y");

             }
             case 5->{
              int temp=x;
               x=y;
               y=temp;
               System.out.println("x is "+x);
               System.out.println("y is "+y);
             }

            }
    
        }
    }    
}        
