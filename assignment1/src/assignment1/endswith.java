package assignment1;
import java.util.Scanner;

public class endswith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        System.out.println("enter the string");
		 String  str= s.nextLine();
		 System.out.println("enter the string to check ends with");
		 String  check= s.nextLine();
		 if(str.endsWith(check)) {
			 System.out.println(str+" end with "+check);
		 }
		 else {

			 System.out.println(str+" does not end with "+check);
		 }
	}

}
