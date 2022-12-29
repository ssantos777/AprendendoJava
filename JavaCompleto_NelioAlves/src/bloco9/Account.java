package bloco9;

public class Account {

	private String holder;
	private int number;
	private double balance;

	public Account() {

	}

	public Account(String holder, int number) {
		this.holder = holder;
		this.number = number;
	}

	public Account(String holder, int number, double initialDeposit) {
		this.holder = holder;
		this.number = number;
		deposito(initialDeposit);
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	public void saque(double value) {
		if (balance > value) {
			balance -= value + 5;
		} else {
		
		}
	}

	public void deposito(double value) {
		balance += value;
	}

	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);

	}
	
}
