package assignment1;
import java.util.Scanner;

public class vertically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		 System.out.println("enter the content of document");
		 String  str= s.nextLine();
		 String str1=str;
		 int n=str.length();
		 for(int i=0;i<n;i++) {
			 for(int j=n-1;j>=0;j--) {
			 System.out.print(str.charAt(i)+" ");
			 i++;
				 System.out.println(str1.charAt(j));
			 }
		 }
		 
		 
		

	}

}
