public class printSumOneToTenEvenNumber{
	public static void main(String[] args) {
		int i=1,esum=0,osum=0;
		while(i<=10)
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