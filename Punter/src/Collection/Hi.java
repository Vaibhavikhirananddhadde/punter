package Collection;
import java.util.ArrayList;
public class Hi 
{
	public static void main(String[] args)
	{
		ArrayList l1=new ArrayList();
		l1.add(2);
		l1.add(20.56);
		l1.add(4.1f);
		l1.add('A');
		l1.add("hi");
		System.out.println(l1.size());
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		
	}

}
