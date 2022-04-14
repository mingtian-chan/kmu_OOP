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
		System.out.println(amount + "��ŭ �Ա� �մϴ�.");
		balance += amount;
		return balance;
	}

	public long withdraw(long amount) {
		Scanner in = new Scanner(System.in);
		System.out.print("���� ������ " + balance + "�� ���� ������ �� �ֽ��ϴ�.\n");
		if (amount > balance) {
			System.out.print("�ܾ��� �����Ͽ� ������ �� �����ϴ�.\n���� �ݾ��� ��� ��� �Ͻðڽ��ϱ�? (y/n)");
			String a;
			a = in.next();

			if (a.equals("y")) { // == �� �ϸ� �ּҰ����� ���ƾ��ؼ� �ȵ�.
				amount = balance;
				System.out.println(amount + "��ŭ ���� �մϴ�.");

				balance -= amount;
				return balance;
			}

			else if (a.equals("n")) {
				System.out.println("�������� �ʽ��ϴ�.");
				return balance;
			}

			else {
				System.out.println("�߸��� �Է��Դϴ�.");
				return balance;
			}
		}

		else {
			System.out.println(amount + "��ŭ ���� �մϴ�.");

			balance -= amount;
			return balance;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Account a = new Account();
		System.out.print("����� ������ �Է��ϼ��� :");
		a.setOwner(in.next());
		System.out.print("������� �ܾ��� ��ŭ �ִ��� ��������. :");
		a.setBalance(in.nextLong());
		System.out.print(a.getOwner() + "���� ���� " + a.getBalance() + "���� ������ �ֽ��ϴ�.\n");
		System.out.print("��ŭ ���� �Ͻðڽ��ϱ�? ");
		a.deposit(in.nextLong());
		System.out.print(a.getOwner() + "���� ���� " + a.getBalance() + "���� ������ �ֽ��ϴ�.\n");
		System.out.print("�󸶸� ���� �Ͻðڽ��ϱ�? ");
		a.withdraw(in.nextLong());
		System.out.print(a.getOwner() + "���� ���� " + a.getBalance() + "���� ������ �ֽ��ϴ�.");
	}
}
