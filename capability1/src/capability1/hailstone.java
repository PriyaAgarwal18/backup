package capability1;
import java.util.*;
import java.util.Scanner;

public class hailstone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter number which is positive");
		int n = s.nextInt();
		int count=0;
		while(n>=1) {
			if(n==1) {
				break;
			}
		if((n%2)==0) {
			
			System.out.print(n +" is even so i take half:" );
			n= n/2;
			System.out.println(n);
			count++;
			
		}
		else {
			System.out.print(n +" is odd so i make 3n+1:");
			n = n*3+1;
			System.out.println(n);
			count++;
		}
		
		
		}
		System.out.println("there are total"+count+"steps to reach 1");
	}

}
