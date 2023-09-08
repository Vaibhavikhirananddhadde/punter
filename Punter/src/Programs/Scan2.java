package Programs;
import java.util.Scanner;
public class Scan2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//creating object for scanner class
		System.out.println("Enter the number");
		int num=sc.nextInt();//initializing number
		if(num%5==0)
		{
			System.out.println(num+" is divisible by 5");
		}
		else
		{
			System.out.println(num+" is not divisible by 5");
		}
		

	}

}
