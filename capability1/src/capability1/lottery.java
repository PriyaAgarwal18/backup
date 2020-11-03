package capability1;
import java.util.*;

public class lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("enter value of a,b,c");
		int a= s.nextInt();
		int b= s.nextInt();
		int c= s.nextInt();
		
		if(a!=b && b!=c &&c!=a)
		{
			System.out.println("the result is 0");
		}
		if(a==b && b==c && c==a) {
			System.out.println("the result is 20");
		}
		if(((a==b)&&(b!=c)) || ((b==c)&&(c!=a))||((c==a)&&(c!=b)))
		{
			System.out.println("the result is 10");
		}

	}

}
