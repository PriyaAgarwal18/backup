package assignment1;
import java.util.Scanner;

public class startswith {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string");
		 String  str= s.nextLine();
		 System.out.println("enter the string to check start with");
		 String  check= s.nextLine();
		 if(str.startsWith(check)) {
			 System.out.println(str+" start with "+check);
		 }
		 else {

			 System.out.println(str+" does not start with"+check);
		 }
		

	}

}
