package capability1;
import java.util.*;

public class numberdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
       System.out.println("enter number");
       int n=s.nextInt();
       int p;
       int count=0;
       while(n>=1) {
       p= n%10;
       n=n/10;
       count++;
       }
       System.out.println("the total number of digits"+count);
	}

}
