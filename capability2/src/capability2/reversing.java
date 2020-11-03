/**
 * 
 */
package capability2;

import java.util.*;

import java.util.Scanner;

/**
 * @author M1055928
 *
 */
public class reversing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the sentence");
		String str = s.nextLine();
		String result ="";
		String reverse ="";
		String first ="";
		int flag = 1;
		String[] arrayofstr = str.split(" ");
		for (String a : arrayofstr) {
			result ="";
			reverse ="";
			first ="";
			for (int i = 0; i < a.length(); i++) {
				char c = a.charAt(i);

				if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
					first += Character.toString(c);
					flag = 0;
				} else {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {

				for (int j = a.length() - 1; j >= 0; j--) {
					result = result + a.charAt(j);
				}
			} else
				result = a;

			reverse = reverse + result;
			System.out.print(result+" ");
		}
	

	}

}
