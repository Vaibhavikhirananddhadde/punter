package Exception;

public class Sample3 
{
	public static void main(String[] args)
	{
		System.out.println("---ms---");
		int[] arr= {1,2,3};
		try
		{
			int x=1/0;
		    try
		    {
		    	System.out.println(arr[9]);
		    }
		    catch(ArrayIndexOutOfBoundsException e)
		    {
		    	System.out.println("handled2");
		    }
		    	
		 } 
		catch(Exception e)
		{
			System.out.println("handled");
		}
		System.out.println("---me---");
		
	}

}
