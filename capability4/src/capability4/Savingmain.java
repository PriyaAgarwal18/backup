package capability4;
import java.util.Scanner;

public class Savingmain {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		 System.out.println("enter customer balance");
		 double balance=scan.nextDouble();
		 System.out.println("enter interest rate");
		 int interestrate=scan.nextInt();
		 System.out.println("enter account no");
		 int accountno=scan.nextInt();
		 System.out.println("enter amount to withdraw");
		 double amount=scan.nextDouble();
		 System.out.println("enter time");
		 int time=scan.nextInt();
		 
		 Saving savings=new Saving(balance,interestrate,accountno);
		 savings.setBalance(balance);
		 savings.setInterestrate(interestrate);
		 savings.setAccountno(accountno);
		 Savingss savings2=new Savingss();
		 savings2.withdraw(savings.getBalance(),amount);
		 savings2.interest(savings.getBalance(),interestrate,time);
		 
		 
		 
		 
		 
		 

	}

}
