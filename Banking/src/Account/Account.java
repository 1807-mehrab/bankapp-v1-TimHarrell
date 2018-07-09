package Account;

import banking.SSN;

public class Account {
	private double interest;
	private String userID;
    transient private SSN ssn;
    private String accountNumber;
    private String routingNumber;
    private double balance;
    private String password;
	
	public Account() {
		balance = 0D;
		interest = 0D;
		userID = "";
		ssn = new SSN();
		accountNumber = "";
		routingNumber = "";
		balance = 0D;
		password = "";
	}
	
	public Account(double balance, double interest, String userID, String social, String AN, String RN, double bal, String pass) {
		this.balance = balance;
		this.interest = interest;
		this.userID = userID;
		accountNumber = AN;
		routingNumber = RN;
		this.balance = balance;
		password = pass;
	}
	
	public void setId(String ID) {
		userID = ID;
	}
	
	public void setAccountNumber(String num) {
		accountNumber = num;
	}
	
	public void setRoutingNumber(String num) {
		routingNumber = num;
	}
	
	public void setBalance(double num) {
		balance = num;
	}
	
	public void setPassword(String pass) {
		password = pass;
	}
	
	public double withdraw(double amount) {
		balance -= amount;
		return balance;
	}
	
	public double deposit(double amount) {
		balance += amount;
		return balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getInterest() {
		return interest;
	}
	
	public void updateBalance(double input) {
        balance = input;
    }

    public void updatessn(int input) {
        ssn.updateNum(input);
    }

    public void updatessn(String input) {
        ssn.updateNum(input);
    }
    
    public Boolean verifyPassword(String input) {
    	return input == password;
    }
	
}
