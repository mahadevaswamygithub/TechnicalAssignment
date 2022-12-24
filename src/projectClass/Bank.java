package projectClass;
class Account{
	int accNum;
	double accBal;
	String userName;
	Account(int accNum,double accBal,String userName){
		this.accNum=accNum;
		this.accBal = accBal;
		this.userName =userName;
	}
	
	void viewAccountBalance() {
		System.out.println("Account Balance is" + accBal);
	}
	void depositAmount(double amount) {
		System.out.println("Depositing Rs"+ amount);
		accBal = accBal+amount;
	}
	void withdrawAmount(double amount) {
		System.out.println("The withDraw amount Rs"+amount);
		if(amount>=accBal) {
			accBal = accBal-amount;
		}
	}
	
}

public class Bank {

	public static void main(String[] args) {
		Account o1 = new Account(1234,100,"afnan");
		
		
		/*o1.accBal = 120000;
		System.out.println("the account balance is"+o1.accBal);
		o1.userName = "mohammed afnan";
		System.out.println("the user name is mohammed"+ o1.userName);*/
		o1.viewAccountBalance();
		o1.depositAmount(10);
		o1.viewAccountBalance();
		o1.withdrawAmount(100);
		o1.viewAccountBalance();
		

	}

}
