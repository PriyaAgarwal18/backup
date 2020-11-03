package capability2;
import java.util.*;
import java.util.Scanner;

public class initials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String output;
		System.out.println("enter name ");
		String name=s.nextLine();
		int l=name.length();
		output= Character.toString(name.charAt(0));
		
		for(int i=0;i<l;i++){
		
		if(name.charAt(i)==' ') {
		 output += Character.toString(name.charAt(i+1));
		
		
		}
		
		
		}
		System.out.print(output);
	}
}


