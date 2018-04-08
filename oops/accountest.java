package oops;

public class accountest {

	public static void main(String[] args) {
		account act = new account();
		act.deposit(100, 1000);
		act.withdraw(100, 500);
		act.balance = 5000;
		
		act.deposit(100, 5000);
		act.withdraw(100, 100);

	}

}
