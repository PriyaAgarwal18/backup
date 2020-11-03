package assignment1;
import java.util.Scanner;

public class multiplespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		 System.out.println("enter the content of document");
		 String  str= s.nextLine();
		 String str1= str.replaceAll(" +", " ");
		 System.out.println(str1);
		 

	}

}
