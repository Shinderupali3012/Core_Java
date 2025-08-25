import java.util.Scanner;
public class ProfitAndLoss{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float profit,loss,cprice,sprice;
		System.out.println("enter cost price");
		cprice=sc.nextFloat();
		System.out.println("Enter selling price");
		sprice=sc.nextFloat();
		if(cprice>sprice)
		{
			System.out.println("Loss is "+(cprice-sprice));
		}
		else
			System.out.println("profit is "+(sprice-cprice));
		
	}
}