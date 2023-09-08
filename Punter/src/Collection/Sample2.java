package Collection;
import java.util.ArrayList;
public class Sample2 
{
	public static void main(String[] args)
	{
		ArrayList l1=new ArrayList();
		l1.add("tumkur");
		l1.add("Hassan");
		l1.add("bendakaluru");
		l1.add("CMY");
		l1.add("KGF");
		System.out.println("----b4 remove()---");
		System.out.println("l1--->"+l1);
		l1.remove("CMY");
		System.out.println("---after remove()---");
		System.out.println("l1--->"+l1);
		l1.remove(0);
		System.out.println("---after remove---");
		System.out.println("l1--->"+l1);
	
	}

}
