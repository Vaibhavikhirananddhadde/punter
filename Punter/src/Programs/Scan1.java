package Programs;
import java.util.Scanner;
public class Scan1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
		{
		  System.out.println(ch+"is alphabet");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println(ch+" is a number");
		}
		else
		{
			System.out.println(ch+" is a spl character");
		}
		
		
			
			
		
		
		

	}

}
