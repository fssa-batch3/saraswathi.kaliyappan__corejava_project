package practice;

public class BankAccount {
   private String accNo;
   private String name;
   private double balance;
   
   public String getaccNo() {
	   return accNo;
   }
   public void setaccNo(String accNo) {
	   this.accNo = accNo;
   }
   public String getname() {
	   return name;
   }
   public void setname(String name) {
	   this.name = name;
   }
   public double getbalance() {
	   return balance;
   }
   public void setbalance(double balance) {
	   this.balance = balance;
   }
   
   
   public static void main(String[] args) {
	   
	BankAccount acc1 = new BankAccount();
	
	acc1.setaccNo("A1204");
	acc1.setname("Dinesh");
	acc1.setbalance(1000);
	
	System.out.println("AccountNo : " + acc1.getaccNo());
	System.out.println("Name : " + acc1.getname());
	System.out.println("Balance : " + acc1.getbalance());
	
}
}
