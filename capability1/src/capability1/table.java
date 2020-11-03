package capability1;
import java.util.*;
import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s = new Scanner(System.in);
      System.out.println("enter the number for table");
      int n = s.nextInt();
      int i=1;
      while(i<13) {
      System.out.println(n+"*"+i+"="+(i*n));
      i++;
	}
	}
}
