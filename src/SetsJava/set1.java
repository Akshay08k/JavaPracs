//Set 1: Banking System (User-Defined Exception for Low Balance)
//Interface Bank → Contains method check_balance().
//Class Account (Base Class) → Attributes: accountHolder, accountNumber, balance.
//Class SavingsAccount (Child Class) → Extends Account, implements Bank.
//User-Defined Exception: LowBalanceException if balance < ₹500.

class LowBalanceException extends Exception{
	LowBalanceException(String message){
		super(message);
	}
}

interface Bank{
	void check_balance() throws LowBalanceException;
}

class Account{
	 String accountHolder;
	 int accountNumber,balance;
	Account(String accountHolder,int accountNumber,int balance){
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	void displayDetails(){
		System.out.println("Account Holder = " + this.accountHolder);
		System.out.println("Account Number = " + this.accountNumber);
		System.out.println("Balance = " + this.balance);
	}
}

class SavingsAccount extends Account implements Bank{
	SavingsAccount(String accountHolder,int accountNumber,int balance){
		super(accountHolder,accountNumber,balance);
	}
	
	public void check_balance() throws LowBalanceException{
		if(balance < 500){
			throw new LowBalanceException("Balance Is Low");
		}else{
			displayDetails();
		}
	}
}

public class set1{
	public static void main(String args[]){
		try{
			SavingsAccount a1 = new SavingsAccount("Akshay",12121212,5000);	
			SavingsAccount a2 = new SavingsAccount("yash",1313131313,200);

			a1.check_balance();
			a2.check_balance();
		}catch(LowBalanceException e){
			System.out.println("Exception : " + e);
		}
	}
}
