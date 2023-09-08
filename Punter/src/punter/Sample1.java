package punter;

public class Sample1
{
	public static void main(String[] args) 
	{
		System.out.println("---ms---");
		String s="javamava";
		try
		{
			System.out.println(s.charAt(9));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("handled");
		}
		System.out.println("----me---");
		
	}

}
