package punter;

public class Sample
{
	public static void main(String[] args) 
	{
		System.out.println("---ms---");
		try
		{
			int x=1/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("handled");
		}
		System.out.println("---me---")
		
	}

}
