package Exception;

public class Shadidotcom
{
	static void submit() throws ShadiException
	{
		int age=17;
		if(age>21)
		{
			System.out.println("Sukha jeevana");
			
		}
		else
		{
			throw new ShadiException ("invalid age");
		}
	}
	
	public static void main(String[] args)
	{
		try
		{
			submit();
		}
		catch(ShadiException e)
		{
			System.out.println(e.getmessage());
		}
		
	}

}
