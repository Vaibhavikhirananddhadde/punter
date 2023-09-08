package Programs;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
public class Sample2 
{
	public static void main(String[] args) 
	{
		int[]arr= {10,20,30,10,20};
		LinkedHashMap<Integer,Integer>L1=new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(!L1.containsKey(arr[i]))
			{
				L1.put(arr[i], 1);
			}
			else
			{
				int X=L1.get(arr[i]);
				X++;
				L1.put(arr[i], X);
			}
		}
		for(Entry<Integer,Integer>a1:L1.entrySet())
		{
			int Y=a1.getKey();
			int Z=a1.getValue();
			if(Z>1)
			{
				System.out.println(a1.getKey()+" "+a1.getValue());
			}
			
			
		}
		
	}

}
