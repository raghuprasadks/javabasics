package oops;
public class account {	
	private int acctnum; // private
	public String acctname; // public	
 //	protected float balance; // protected
	float balance; // default	
	public float deposit(int acctnum,float amt)
	{
		this.acctnum = acctnum;
		balance = balance +amt;
		return 	balance;
	}

	public float withdraw(int acctnum,float amt)
	{
		this.acctnum = acctnum;
		balance = balance - amt;
		return 	balance;
	}
}
