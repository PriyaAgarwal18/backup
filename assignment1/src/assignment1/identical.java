package assignment1;
import java.util.Scanner;

public class identical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		 System.out.println("enter the string");
		 String  str= s.nextLine();
		StringBuffer sb = new StringBuffer(str);
		 int n= str.length();
		 for(int i=0;i<n;i++) {
			 if(sb.charAt(i)==sb.charAt(i+1)){
				 
				 sb.insert((i+1),"*");
				 
			 }
		 }System.out.println(sb);

	}

}
