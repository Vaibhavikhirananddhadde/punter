package Sample;

class ICICI1
{
 private int ATM_pin=1111;
  public int getATM_pin()
{
	return ATM_pin;
}
    public void setATM_pin(int ATM_pin)
    {
	this.ATM_pin = ATM_pin;
    }
}
  public class Mainclass4
{
	public static void main(String[]args) 
	{
		ICICI i=new ICICI();
		System.out.println(i.getATM_pin());
		i.setATM_pin(6421);
		System.out.println(i.getATM_pin());
	}
}
