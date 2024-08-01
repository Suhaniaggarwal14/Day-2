
package Banking;

public class Account {

	protected String accNo;
	private String accHolderName;
	private int pin;
	private String bankName;
	private String ifscCode;
	protected double balance;
	
	public Account() {
		super();
	}

	public Account(String accNo, String accHolderName, int pin, String bankName, String ifscCode, double balance) {
		super();
		this.accNo = accNo;
		this.setAccHolderName(accHolderName);
		this.pin = pin;
		this.setBankName(bankName);
		this.setIfscCode(ifscCode);
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accHolderName=" + getAccHolderName() + ", bankName="
				+ getBankName() + ", ifscCode=" + getIfscCode() + ", balance=" + balance + "]";
	}
	
	public void changePin(int curPin, int newPin) {
		if (this.pin == curPin)
			this.pin = newPin;
		else
			System.out.println("Incorrect current PIN.");
	}
	
	public boolean authenticate(int pin) {
		return this.pin == pin;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
			System.out.println("Deposited: " + amount + ", New Balance: " + this.balance);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}
	
	public void withDraw(double amount) {
		// To be overridden in subclasses
		System.out.println("Withdraw method in Account class.");
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
}
