package assignment1;
import java.util.Scanner;

public class replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s = new Scanner(System.in);
       System.out.println("enter the content of document");
		 String  str= s.nextLine();
		 System.out.println("enter the old content of document to be replaced");
		 String  str1= s.nextLine();
		 System.out.println("enter the new content of document to be replaced");
		 String  str2= s.nextLine();
		 String str3=str.replace(str1, str2);
		 System.out.println("enter the new content of document");
		 System.out.println(str3); 
		 
	}

}
