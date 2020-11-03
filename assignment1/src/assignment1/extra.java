package assignment1;
import java.util.Scanner;

public class extra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n= s.nextInt();
		
		int m,p=0,q,r=0;
		if(n>1000&&n<10000000) {
			while(n>0) {
			
			m=n%10;
			p=p+m;
			n=n/10;
			}
			while(p>0) {
				
				q=p%10;
				r=q+r;
				p=p/10;
				}
			System.out.print(r);
		}

	}

}
