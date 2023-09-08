package Collection;
import java.util.ArrayList;
public class Demo 
{
	public static void main(String[] args) 
	{
		ArrayList l1=new ArrayList();
		l1.add("tumkur");
		l1.add("hassan");
		l1.add("bendakaluru");
		l1.add("CMY");
		l1.add("KGF");
		if(l1.contains("Hassan"))
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("not found");
		}
		
	}

}
