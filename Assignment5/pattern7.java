
public class Pattern7{
	public static void main(String[] args) {
		int count=5;
		for(int i=0;i<5;i++)
		{	
			for(int j=0;j<5;j++)
			{
				if(j<=i)
				System.out.print("\t"+(5-j));
			   else 
			   	System.out.print("\t"+(5-i));

			}		
			
			System.out.println();
		}
	}
	
}