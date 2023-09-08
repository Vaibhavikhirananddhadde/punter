package Programming;
import java.util.ArrayList;
public class Sample
{
	public static void main(String[] args)
	{
		ArrayList<Integer>L1=new ArrayList<Integer>();
		L1.add(5);
		L1.add(10);
		L1.add(20);
		L1.add(25);
		L1.add(30);
		int[]arr=new int[L1.size()];
		for(int i=0;i<L1.size();i++)
		{
			arr[i]=(int)L1.get(i);
		}
		for(int i=0;i<arr.length;i++)
		{
		 
		System.out.println(arr[i]);
		}
		
		
		
	}

}
