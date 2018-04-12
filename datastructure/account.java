package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class account {	
	int acctNo;
	String name;
	float balance;
	
	account (int acctNo,String name,float balance){
		this.acctNo = acctNo;
		this.name = name;
		this.balance = balance;
	}	
	public String getAccountInfo()
	{
		return "Account No : " +this.acctNo + " Name : " +this.name +" Balance : "+this.balance;
	}

	public static void main(String[] args) {
	//	account sunita = new account ();
		account sunita = new account(100,"Sunita",10000);

		account surya = new account(101,"Surya",20000);

		ArrayList<account> acctList = new ArrayList<account> ();
		acctList.add(sunita);
		acctList.add(surya);
		
		Iterator itr = acctList.iterator();
		while (itr.hasNext())
		{
			account act = (account)itr.next();
			System.out.println("Account Info " +act.getAccountInfo());
		}	
	
	}

}
