public class SumOfEvenAnddOddNumber{
	public static void main(String[] args) {
		int i=100,esum=0,osum=0;
		while(i<=200)
		{
			if(i%2==0)
				esum+=i;
			else 
				osum+=i;
			i++;
		}
		System.out.println("sum of even number is "+esum);
		System.out.println("sum od odd number is "+osum);
	}
}