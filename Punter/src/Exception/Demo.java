package Exception;

public class Demo 
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
		System.out.println("---me---");
		
	}

}
