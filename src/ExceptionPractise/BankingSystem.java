
// Set 1: Banking System (User-Defined Exception for Low Balance)
// Interface Bank → Contains method check_balance().
// Class Account (Base Class) → Attributes: accountHolder, accountNumber, balance.
// Class SavingsAccount (Child Class) → Extends Account, implements Bank.
// User-Defined Exception: LowBalanceException if balance < ₹500.
// //---------------------------
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}


interface Bank {
    int check_balance() throws LowBalanceException;
}

class Account {
    String accountHolder;
    int accountNumber, balance;

    Account(String accountHolder, int accountNumber, int balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayInfo() {
        System.out.println("Holder Name : " + this.accountHolder);
        System.out.println("Account Number : " + this.accountNumber);
        System.out.println("Balance : " + this.balance);
    }

}

class SavingAccount extends Account implements Bank {
    SavingAccount(String accountHolder, int accountNumber, int balance) {
        super(accountHolder, accountNumber, balance);
    }

    public int check_balance() throws LowBalanceException {
        if (balance < 500) {
            throw new LowBalanceException("Balance Is Low");
        } else {
            displayInfo();
            return 0;
        }
    }
}

public class BankingSystem {
    public static void main(String args[]) {
        try {
            SavingAccount AK = new SavingAccount("Akshay", 1010101010, 10000000);
            SavingAccount BK = new SavingAccount("Ck", 1010101240, 1000);
            SavingAccount CK = new SavingAccount("Bk", 1010101010, 200);
            AK.check_balance();
            BK.check_balance();
            CK.check_balance();
        } catch (LowBalanceException e) {
            System.out.print("Exception Occured :  " + e);
        }
    }
}