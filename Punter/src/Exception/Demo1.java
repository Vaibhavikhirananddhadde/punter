package Exception;

public class Demo1 
{
	public static void main(String[] args) 
	{
		System.out.println("---ms---");
		int[] arr= {1,3,2,5,4};
		try
		{
			System.out.println(arr[8]);
		}
		finally
		{
			System.out.println("i am there finally");
		}
		System.out.println("---me---");
		
	}

}
