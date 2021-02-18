package Solution;

import java.util.List;

public class AccountManager {

	public static double computeAccountBalanceSum(List<Employee> emps) {
		int sum = 0;

		for (Employee e : emps) {
			sum += e.getBalanceAccounts();
		}

		return sum;
	}
}
