package Exception;

public class Sample2 
{
	public static void main(String[] args) 
	{
		System.out.println("---ms---");
		try
		{
			int x=1/0;
			System.out.println("hi");
		}
		catch(Exception e)
		{
			System.out.println("handled");
		}
		System.out.println("---me---");
		
	}

}
