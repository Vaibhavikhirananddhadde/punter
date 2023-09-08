package Programs;
import java.util.Scanner;
public class Swaping
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int no=sc.nextInt();
		System.out.println("Enter the 2nd number");
		int no2=sc.nextInt();
		System.out.println("before swaping");
		System.out.println(no+"/n"+no2);
		int temp=no;
		no=no2;
		no2=temp;
		System.out.println(no+"/n"+no2);
		
		
	}

}
