package punter;


public class Sample4
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
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("addressed");
		}
		System.out.println("---me---");
		
		
	}

}
