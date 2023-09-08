package Exception;

public class Sample1 
{
	public static void main(String[] args)
	{
		System.out.println("---ms---");
		try
		{
			int x=1/0;
		}
		catch(Exception e)
		{
			System.out.println("handled");
		}
		catch(ArithmeticException e)
		{
			System.out.println("handled1");
		}
		System.out.println("---me---");
		
	}

}
