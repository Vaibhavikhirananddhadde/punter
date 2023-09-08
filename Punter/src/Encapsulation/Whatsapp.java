package Encapsulation;

public class Whatsapp
{
	private int password=967307;
	public int get_password()
	{
		return password;
	}
	public void set_password(int password)
	{
		this.password=password;
	}

}
class Mainclass
{
	public static void main(String[] args)
	{
		Whatsapp w=new Whatsapp();
		System.out.println(w.get_password());
		w.set_password(148986);
		System.out.println(w.get_password());
		
		
	}
}
