package Programs;

public class DigitRev 
{
	public static void main(String[] args) 
	{
		int a=1345;
		while(a!=0)
		{
			int rem=a%10;
			System.out.println(rem);
			a=a/10;
		}
		
		
	}

}
