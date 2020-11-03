package capability4;

public class Saving {
	double balance;
	 int interestrate;
	 int accountno;
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getInterestrate() {
		return interestrate;
	}
	public void setInterestrate(int interestrate) {
		this.interestrate = interestrate;
	}
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	 Saving(double balance,int interestrate,int accountno){
		 this.balance=balance;
		 this.interestrate=interestrate;
		 this.accountno=accountno;
		 
	 }
	 Saving(){
		 
	 }
	
}
