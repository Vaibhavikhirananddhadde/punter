package Exception;

public class Flipcartdotcom 
{
	static void purchase() throws FlipcartException
	{
		int pant=700;
		if(pant>5000)
		{
			System.out.println("500 rs discount");
		}
		else
		{
			throw new FlipcartException("pantu illa discountu illa");
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			purchase();
		}
		catch(FlipcartException e)
		{
			System.out.println(e.getDiscount());
		}

		
	}

}
