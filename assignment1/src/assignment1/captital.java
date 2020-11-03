package assignment1;
import java.util.*;

public class captital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.nextLine();
		
		
		for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==' '||i==0) {
			if(i!=0) {
				System.out.print( " ");
				System.out.print(str.toUpperCase().charAt(i+1));
				i++;
				continue;
			}
			else if(i==0) {
				System.out.print( " ");
				System.out.print(str.toUpperCase().charAt(i));
				
				continue;
			}
		}System.out.print(str.charAt(i));
			
		}

	}

}
