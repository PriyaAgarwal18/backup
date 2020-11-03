package capability1;
import java.io.*;
import java.util.*;

public class LCMGCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter two number");
		int n= s.nextInt();
		int m = s.nextInt();
		int p;
		int gcd=1;
		for(int i=1;i<=n &&i<=m;i++)
		{
		if((n%i)==0 &&( m%i)==0) {
			gcd=i;	
			}}
		
		System.out.println("gcd"+gcd);
		p=n*m/gcd;
		System.out.println("lcm"+p);		}
		

	}


