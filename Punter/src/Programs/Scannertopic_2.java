package Programs;
import java.util.Scanner;
public class Scannertopic_2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		String[] msd=new String[size];
		System.out.println("Enter the elements");
		for(int i=0;i<msd.length;i++)
		{
			msd[i]=sc.next();
		}
		for(int i=0;i<msd.length;i++)
		{
			System.out.println(msd[i]);
		}
		
		
	}

}
