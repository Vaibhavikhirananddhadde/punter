package Sample;

class ICICI 
{
 private int ATM_pin=1111;
  public int getATM_pin()
{
	return ATM_pin;
}
    public void setATM_pin(int ATM_pin) {
	this.ATM_pin = ATM_pin;
    }
}
  public class Mainclass4
{
	public satic void main(string[]args) 
	{
		ICICI i=new ICICI();
		system.out.println(i.getATM_pin());
		i.setATM_pin(6421);
		system.out.println(i.getATM_pin());
	}
}