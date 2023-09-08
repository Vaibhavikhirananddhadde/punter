package Exception;

public class ShadiException extends Exception
{
	String msg;
	ShadiException(String msg)
	{
		this.msg=msg;
	}
	public String getmessage()
	{
		return msg;
		
	}

}
