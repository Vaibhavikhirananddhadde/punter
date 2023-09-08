package punter;

public class Demo 
{
	public static void main(String[] args)
	{
		System.out.println("---ms---");
		Demo d=null;
		try
		{
			System.out.println(d.hashCode());
		}
		catch(NullPointerException e)
		{
			System.out.println("handled");
			
		}
		System.out.println("---me---");
		
	}

}
