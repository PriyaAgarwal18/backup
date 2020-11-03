package assignment1;
import java.util.*;

public class split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string");
		 String  str= s.nextLine();
		 String []arraystr =str.split(" ");
		 int n=str.length();
		 for(int i=0;i<n;i++) {
			 System.out.println(arraystr[i]);
		 }
		 s.close();
	}

}
