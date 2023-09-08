package Programs;
import java.util.Scanner;
public class Scan3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first nymber");
		int a=sc.nextInt();
		System.out.println("Enter the second value");
		int b=sc.nextInt();
		System.out.println("Enter the third value");
		int c=sc.nextInt();
		//comparing 2 numbers and storing largest number in temp
		int temp=a>b?a:b;
		//comparing c with temp and storing in a variable
		int largest=c>temp?c:temp;
		System.out.println(largest);

	}

}
