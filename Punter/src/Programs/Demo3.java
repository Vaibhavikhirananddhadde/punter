package Programs;
import java.util.Scanner;
public class Demo3 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		int[] vai=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<vai.length;i++)
		{
			vai[i]=sc.nextInt();
		}
		for(int i=0;i<vai.length;i++)
		{
			System.out.println(vai[i]);
		}
		
		
	}

}
