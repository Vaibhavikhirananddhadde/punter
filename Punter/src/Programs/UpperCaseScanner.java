package Programs;
import java.util.Scanner;
public class UpperCaseScanner 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char i=sc.next().charAt(0);
		char j=sc.next().charAt(0);
		for(int k=i;k<=j;k++)
		{
			System.out.println(i+" "+(char)(i+32));
		}
		
	}

}
