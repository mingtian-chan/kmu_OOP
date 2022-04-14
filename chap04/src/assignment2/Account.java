package assignment2;

class Account {
	private String owner;
	private long balance;

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}

	Account(String owner) {
		this.owner = owner;

	}

	Account(long balance) {
		this.balance = balance;
	}

	Account() {

	}
}