package capability1;
import java.util.*;


public class algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter a and b");
		int a= s.nextInt();
		int b = s.nextInt();
		int i=1;
		if(a>b) {
			System.out.println("invalid");
			System.exit(0);
		}
		if(a<=0 || b<=0) {
			System.out.println("invalid");
			System.exit(0);
		}
		for(i=1;i<=10;i++) {
			a =a+b;
			b=b+10;
			System.out.println("value of a "+a  +"b is"  +b);
		}
		

	}

}
