package assignment2_2;

import java.util.Scanner;

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
		this.balance = 0;

	}

	Account(long balance) {
		this.owner = "";
		this.balance = balance;
	}

	Account() {
		this.owner = "";
		this.balance = 0;

	}

	public long deposit(long amount) {
		System.out.println(amount + "만큼 입금 합니다.");
		balance += amount;
		return balance;
	}

	public long withdraw(long amount) {
		Scanner in = new Scanner(System.in);
		System.out.print("현재 고객님은 " + balance + "원 까지 인출할 수 있습니다.\n");
		if (amount > balance) {
			System.out.print("잔액이 부족하여 인출할 수 없습니다.\n가진 금액을 모두 출금 하시겠습니까? (y/n)");
			String a;
			a = in.next();

			if (a.equals("y")) { // == 로 하면 주소값까지 같아야해서 안됨.
				amount = balance;
				System.out.println(amount + "만큼 인출 합니다.");

				balance -= amount;
				return balance;
			}

			else if (a.equals("n")) {
				System.out.println("인출하지 않습니다.");
				return balance;
			}

			else {
				System.out.println("잘못된 입력입니다.");
				return balance;
			}
		}

		else {
			System.out.println(amount + "만큼 인출 합니다.");

			balance -= amount;
			return balance;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Account a = new Account();
		System.out.print("사용자 성함을 입력하세요 :");
		a.setOwner(in.next());
		System.out.print("사용자의 잔액은 얼만큼 있는지 적으세요. :");
		a.setBalance(in.nextLong());
		System.out.print(a.getOwner() + "님은 현재 " + a.getBalance() + "원을 가지고 있습니다.\n");
		System.out.print("얼만큼 저축 하시겠습니까? ");
		a.deposit(in.nextLong());
		System.out.print(a.getOwner() + "님은 현재 " + a.getBalance() + "원을 가지고 있습니다.\n");
		System.out.print("얼마를 인출 하시겠습니까? ");
		a.withdraw(in.nextLong());
		System.out.print(a.getOwner() + "님은 현재 " + a.getBalance() + "원을 가지고 있습니다.");
	}
}
