public class Pattern2{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			int count=5;
			for(int j=1;j<=5;j++)
			{
				if(j<=i)
				{
					System.out.print(count);
					count--;
				}
				else 
					System.out.print(" ");

			}
			System.out.println();
		}
	}
	
}