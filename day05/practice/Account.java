package day05.practice;

//Change the below class to have setters and Getters and Constructors
class Account  {
	private String accNo;
    private double balance;
    
    public Account(String accNo,double balance) {
    	this.accNo  = accNo;
    	this.balance = balance;
    }
    
    public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}	
}
//implement the ATM interface:
interface ATM{
	boolean deposit(Account account, double amount);
	boolean withdraw(Account account, double amount)throws Exception;
	double getBalance();
}
// creating the AxisATM implementation:

class AxisATM implements ATM{
    private static final double WITHDRAWAL_CHARGE = 5;

   @Override 
public boolean deposit(Account account, double amount) {
	   account.setBalance(account.getBalance()+amount);
	   return true;
   }

@Override
public boolean withdraw(Account account, double amount) throws Exception {
       if(account.getBalance()<5000) {
    	   throw new Exception("Insufficent balance");
       }
       double totalAmount = amount +WITHDRAWAL_CHARGE;
       if(totalAmount <= account.getBalance()) {
    	   account.setBalance(account.getBalance() - totalAmount);
    	   return true;
       }
       return false;
}

@Override
public double getBalance() {
    return account.getBalance();
}

}


package day05.practice;

//creating the IciciATM implementation

public class IciciATM impliments ATM{
private static final double WITHDRAWAL_CHARGE = 10;

@Override
public boolean deposit(Account account, double amount) {
   account.setBalance(account.getBalance() + amount);
   return true;
}
@Override
public boolean withdraw(Account account, double amount) throws Exception {
   if (account.getBalance() < 10000) {
       throw new Exception("Insufficient balance");
   }
   
   double totalAmount = amount + WITHDRAWAL_CHARGE;
   if (totalAmount <= account.getBalance()) {
       account.setBalance(account.getBalance() - totalAmount);
       return true;
   }
   
   return false;
}
@Override
public double getBalance() {
   return account.getBalance();
}

}


