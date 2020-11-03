package capability4;
import java.util.Scanner;

public class Bankmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of customers account ");
        int number=scan.nextInt();
        scan.nextLine();
       Bank Banks[ ]=new Bank[number];
       for(int i=0;i<number;i++) {
    	   System.out.println("enter the of customers id "); 
    	  int  custid=scan.nextInt();
    	  scan.nextLine();
    	  System.out.println("enter the of customers name "); 
    	  String  custname=scan.nextLine();
    	  System.out.println("enter the of customers address "); 
    	  String  custaddress=scan.nextLine();
    	  System.out.println("enter the of customers account type "); 
    	  String  acttype=scan.nextLine();
    	  System.out.println("enter the of customers balance "); 
    	  double  custbalance=scan.nextInt();
    	 /* Bank banks1=new Bank( custid,custname,custaddress);
    	  Banks[i]=banks1;*/
    	  Bank banks2=new Bank( custid,custname,custaddress,acttype,custbalance);
    	  Banks[i]=banks2;
    	  /*Bank banks3=new Bank( custid,custname);
    	  Banks[i]=banks3;*/
    	  }
       for(int i=0;i<number;i++) {
    	   System.out.println("customer "+(i+1)+" details");
    	   System.out.println("customer id "+Banks[i].custid);
    	   System.out.println("customer name "+Banks[i].custname);
    	   System.out.println("customer address "+Banks[i].custaddress);
    	   System.out.println("customer account type "+Banks[i].acttype);
    	   System.out.println("customer customer balance "+Banks[i].custbalance);
       }
	}

}
