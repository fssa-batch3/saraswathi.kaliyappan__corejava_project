 package practice;



public class Account3 {
	private String accNo;
	private String name;
	private double balance;


	public Account3(String accNo,String name,double balance) {		
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}



	public Account3() {
		// TODO Auto-generated constructor stub
	}



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
}

class toStringDemo{
	public static void main(String[] args) {
		Account3 acct1 = new Account3();
		acct1.setaccNo("A3052");
		acct1.setname("naresh");
		acct1.setbalance(300);
		
		System.out.println(acct1);
	}
}
