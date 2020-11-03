package capability2;
import java.util.*;
import java.util.Scanner;

public class maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=3;
		System.out.println("enter three number");
		int a=s.nextInt();
		int b=s.nextInt();
		int c= s.nextInt();
		System.out.println(getmax(a,b,c));
		s.close();

	}
	public static int getmax(int a,int b,int c) {
		if(a>b&&a>c)
		return a;
		else if(b>c&&b>a)
			return b;
		else
			return c;
	}

}
