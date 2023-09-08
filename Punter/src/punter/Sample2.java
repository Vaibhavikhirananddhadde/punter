package punter;

public class Sample2
{
	public static void main(String[] args) 
	{
		System.out.println("---ms---");
		int[] arr= {1,3,5,2,4};
		try
		{
			System.out.println(arr[8]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("handled");
		System.out.println("---me---");
		}
	}

}
