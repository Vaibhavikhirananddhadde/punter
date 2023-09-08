package Exception;

public class FlipcartException extends Exception
{
	String disc;
	FlipcartException(String disc)
	{
		this.disc=disc;
	}
	public String getDiscount()
	{
		return disc;
	}

}
