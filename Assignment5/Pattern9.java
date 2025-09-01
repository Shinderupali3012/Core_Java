
public class Pattern9{
	public static void main(String[] args) {
		int count;
		for(int i=1;i<=5;i++)
		{	
			count=i;
			for(int j=5;j>=1;j--)
			{
				if(j<i)
					System.out.print(j);
				else
				{ 
					System.out.print(count);
					count++;
				}	

			}		
			
			System.out.println();
		}
	}
	
}