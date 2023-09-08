package Collection;
import java.util.ArrayList;

public class Sample
{
	public static void main(String[] args)
	{
		ArrayList l1=new ArrayList();
		l1.add(2);
		l1.add(1.1);
		l1.add(true);
		l1.add("hi");
		ArrayList l2=new ArrayList();
		l2.add(24);
		l2.add(1.13);
		l2.add(true);
		l2.add("bye");
		System.out.println("--b4 addAll----");
		System.out.println("l1--->"+l1);
		System.out.println("l2--->"+l2);
		l1.addAll(l2);
		System.out.println("---after addAll()---");
		System.out.println("l1--->"+l1);
		System.out.println("l2-->"+l2);
		
	}

}
