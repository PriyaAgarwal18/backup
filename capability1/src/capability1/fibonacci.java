package capability1;
import java.util.*;
import java.util.Scanner;

public class fibonacci {
static int n,sum=0,a=0,b=1,c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter value upto which fibonacci is to be created");
		
		n= s.nextInt();
		System.out.println(sum(n,a,b));
	s.close();
		
		
		

	}
	public static int sum(int n2,int a1,int b1) {
		while(c<=n)
		{
			c=a+b;
			a=b;
			b=c;
			if(c%2==0)
				sum= sum+c;
		}
		return sum;
	}

}
