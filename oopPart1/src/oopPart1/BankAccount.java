package oopPart1;

public class BankAccount {
	private String accountNumber;
	private double balance;
	private String customerName;
	private String eMail;
	private String phoneNumber;
	
	// constructors
	public BankAccount() {
		this("",0,"","","");
	}
	public BankAccount(String accountNumber, double balance, String customerName, String eMail, String phoneNumber) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.eMail = eMail;
		this.phoneNumber = phoneNumber;
	}
	
	//setters
	public void setAccountNumber(String n) {
		this.accountNumber = n;
	}
	public void setBalance(double b) {
		this.balance = b;
	}
	public void setCustomerName(String n) {
		this.customerName = n;
	}
	public void setEmail(String e) {
		this.eMail = e;
	}
	public void setPhoneNumber(String ph) {
		this.phoneNumber = ph;
	}
	
	// getters
	public String getAccountNumber() {
		return this.accountNumber;
	}
	public double getBalance() {
		return this.balance;
	}
	public String getCustomerName() {
		return this.customerName;
	}
	public String getEmail() {
		return this.eMail;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	// Methods
	public void deposit(double deposit) {
		this.balance = this.balance + deposit;
		System.out.println("After your deposit of " + deposit + ", your new balance is: " + this.balance);
	}
	
	public void withdraw(double amount) {
		if(amount > this.balance) {
			System.out.println("You do not have enough funds. Your current balance is: " + this.balance);
			return;
		}
		this.balance -= amount;
	}

}
