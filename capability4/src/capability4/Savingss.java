package capability4;

public class Savingss {
	public void withdraw(double balance,double amount) {
		if(balance<amount) {
			System.out.println("balance is less than amount");}
			else {
				double res=balance-amount;
				System.out.println("the amount withdrawn from account is"+amount);
				System.out.println("the amount in account after withdrawn"+res);
			
		}
	}
	public void interest(double balance,double interestrate,int time) {
		double result=(balance*time*interestrate)/100;
		System.out.println("Interest"+result);
	}
}
