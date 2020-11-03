package capability2;
import java.util.*;
import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); 
		System.out.println("enter the number to be reversed");
		int n=s.nextInt();
		int p;
		
		while(n>=1) {
		       p= n%10;
		       n=n/10;
		       System.out.print(p);

		       
		       }
		       
	}

}
