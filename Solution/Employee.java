package Solution;

import java.util.List;

public class Employee {

	private String id;
	private List<Account> accounts;

	public Employee(String id, List<Account> accounts) {
		this.id = id;
		this.accounts = accounts;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	// mine
	public double getBalanceAccounts() {
		double sum = 0;
		for (Account a : accounts) {
			sum += a.getBalance();
		}

		return sum;

	}
}
