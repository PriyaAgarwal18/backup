package capability2;
import java.util.Scanner;
import java.util.Scanner;

public class prime {
	public static boolean isprime(int n) {
		int count=0;
		
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
				count++;	
				}
			}
				
			
		if(count==0)	{
			return true;
		}
		else 
			return false;
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number to check prime number");
		int n=s.nextInt();
		System.out.println(isprime(n));
		
		}
	

}
