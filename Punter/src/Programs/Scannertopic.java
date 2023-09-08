package Programs;
import java.util.Scanner;
public class Scannertopic
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int[] dsm=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<dsm.length;i++)
		{
			dsm[i]=sc.nextInt();
		}
		for(int i=0;i<dsm.length;i++)
		{
			System.out.println(dsm[i]);
		}
		
		
	}

}
