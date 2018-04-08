package workingjava;

public class AccountManagement {
	
	String name;
	int accountnumber;
	String address;
	float balance;
	String addressProof;
	
	public static void main(String[] args) {
		AccountManagement am1 = new AccountManagement();
		am1.accountnumber = am1.createAccount("Raghu", "Jakkur", "Voter Id Card");
		System.out.println("Your Account number is " +am1.accountnumber);
	
	
		AccountManagement am2 = new AccountManagement();
		am1.accountnumber = am2.createAccount("Surya", "Jakkur Layout", "Aadhar");
		System.out.println("Your Account number is " +am2.accountnumber);

	
	
	}
	
	public int createAccount(String yourName,String yourAddress,String yourAddressProof) {
		//this.name = yourName;
		name = yourName;
		address = yourAddress;
		addressProof = yourAddressProof;
		
		return 100;
	}
	
	public float deposit (int accountnumber,float amt) {
		this.accountnumber = accountnumber;
		this.balance = this.balance + amt;
		return balance;
	}

}
