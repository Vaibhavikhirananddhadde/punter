package Programs;

public class Sample 
{
	static int[] disp(int[]abb,int times)
	{
		for(int i=1;i<=times;i++)
		{
			int temp=abb[0];
			for(int j=0;j<abb.length-1;j++)
			{
				abb[]=abb[j+1];
			}
			abb[abb.length-1]=temp;
		}
		return abb;
	}
	public static void main(String[] args) 
	{
		int[]arr= {7,6,3,1,2};
		int[]upd=disp(arr,1);
		for(int k=0;k<upd.length;k++)
		{
			System.out.println(upd[k]);
		}
		
	}

}
