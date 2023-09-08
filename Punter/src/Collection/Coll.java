package Collection;
import java.util.ArrayList;
import java.util.Collections;
public class Coll 
{
	public static void main(String[] args)
	{
		ArrayList l1=new ArrayList();
		l1.add(12);
		l1.add(1);
		l1.add(3);
		l1.add(5);
		l1.add(4);
		System.out.println("---b4 sort---");
		System.out.println("l1--->"+l1);
		Collections.sort(l1);
		System.out.println("--after sort---");
		System.out.println("l1--->"+l1);
		
	}

}
