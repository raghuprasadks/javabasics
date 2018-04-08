package workingjava;

public class accounts {

	String name;
	int acctnum;
	int balance;
	int adhar;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		accounts acct = new accounts("raghu",100,1000);
		System.out.println("Account Information is " +acct.name + " account number "+acct.acctnum);

		accounts acct1 = new accounts("raghu",100,1000,123456789);
		System.out.println("Account Information is " +acct1.name + " account number "+acct1.acctnum + " Adhar : " +acct1.adhar);

		
	}
	
	public accounts (String name,int acctnum,int balance){
		this.name = name;
		this.acctnum = acctnum;
		this.balance = balance;
	}

	public accounts (String name,int acctnum,int balance, int adhar){
		this.name = name;
		this.acctnum = acctnum;
		this.balance = balance;
		this.adhar = adhar;
		
	}
}
