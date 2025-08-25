import java.util.Scanner;
public class CalculateAverage{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float sub1,sub2,sub3,total,per;
		System.out.println("enter sub1 mark");
		sub1=sc.nextFloat();
		System.out.println("enter sub 2nd mark");
		sub2=sc.nextFloat();
		System.out.println("enter sub 3rd mark");
		sub3=sc.nextFloat();
		total=sub1+sub2+sub3;
		per=total/3;
		if(per>=80)
			System.out.println("class I "+per);
		else if(per<80 && per>=60)
			System.out.println("class II "+per);
		else if(per<60 && per>=50)
			System.out.println("class III "+per);
		else if(per>=35 && per<50)
			System.out.println("pass "+per);
		else
			System.out.println("fail");

	}
}