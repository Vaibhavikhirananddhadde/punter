package Programming;
import java.util.ArrayList;
public class Demo 
{
	public static void main(String[] args)
	{
		int[]arr= {10,20,30,40};
		ArrayList<Integer>L1=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			L1.add(arr[i]);
		}
		System.out.println(L1);
		
	}

}
