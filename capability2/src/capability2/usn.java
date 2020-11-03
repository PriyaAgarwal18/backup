package capability2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class usn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter usn");
		String usn= s.nextLine();
		int p=usn.length();
		if(p==10) {
			String reg="^[0-9]{1}[A-Z]{2}[\\d]{2}[A-Z]{2}[\\d]{3}";
			if(Pattern.matches(reg, usn))
			System.out.println("valid usn");
			else
				System.out.println("invalid usn");
			}
		else
			System.out.println("invalid usn");
			
		}

	}


