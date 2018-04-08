package workingjava;

public class Account {
	
	String name;
	int accountnumber;
	String address;
	float balance;
	
	final static String bank ="ICICI";
	static String branch ="Sahakar Nagar";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acct1 = new Account();
		acct1.name = "Raghu Prasad K S";
		acct1.accountnumber = 100;
		acct1.address = "1094,Indushankara,Jakkur,Bengaluru";
		acct1.balance = 100;
		
		
		
		System.out.println("Raghu's account details : Name : " +acct1.name + " Account Number: " +acct1.accountnumber + " Address : " +acct1.address + " Balance : " +acct1.balance + " Bank :" +Account.bank);
		
		Account acct2 = new Account();
		acct1.name = "Surya";
		acct1.accountnumber = 101;
		acct1.address = "1093,Jakkur Layout,Jakkur,Bengaluru";
		acct1.balance = 2000;
		

	}

}
