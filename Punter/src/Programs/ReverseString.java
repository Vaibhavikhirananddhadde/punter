package Programs;

public class ReverseString
{
	public static void main(String[] args) 
	{
		String g="Vaibhavi";
		String rev="";
		for(int i=g.length()-1;i>=0;i--)
		{
			rev=rev+g.charAt(i);
		}
		System.out.println(rev);
		
	}

}
