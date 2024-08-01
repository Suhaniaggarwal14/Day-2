package Banking;

public class CurrentAccount extends Account {

	private double overDraftLimit;
	
	public CurrentAccount(String accNo, String accHolderName, int pin, String bankName, String ifscCode, double balance, double overDraftLimit) {
		super(accNo, accHolderName, pin, bankName, ifscCode, balance);
		this.overDraftLimit = overDraftLimit;
	}
	
	@Override
	public void withDraw(double amount) {
		if (balance + overDraftLimit >= amount) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
		} else {
			System.out.println("Insufficient funds. Overdraft limit exceeded.");
		}
	}

	@Override
	public String toString() {
		return "CurrentAccount [accNo=" + accNo + ", accHolderName=" + getAccHolderName() + ", bankName="
				+ getBankName() + ", ifscCode=" + getIfscCode() + ", balance=" + balance + ", overDraftLimit=" + overDraftLimit + "]";
	}
}