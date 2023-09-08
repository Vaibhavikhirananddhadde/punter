package Programs;

public class Rotate
{
	static int[] rotate(int []abb,int times)
	{
		for(int i=1;i<=times;i++)
		{
			int temp=abb[0];
			for(int j=0;j<abb.length-1;j++)
			{
				abb[j]=abb[j+1];
			}
			abb[abb.length-1]=temp;
		}
		return abb;
	}
	public static void main(String[] args)
	{
		int []arr= {3,4,5,6,7};
		int []upd=rotate(arr,1);
		for(int k=0;k<upd.length;k++)
		{
			System.out.println(upd[k]);
		}
		
	}

}
