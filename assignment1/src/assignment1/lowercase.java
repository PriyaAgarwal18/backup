package assignment1;
import java.util.Scanner;
public class lowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int count=0;
		System.out.println("enter the string");
		String str= s.nextLine();
		StringBuffer sb = new StringBuffer(str);
		System.out.println("enter the character to move at last");
		char ch= s.next().charAt(0);
		int n=str.length();
		for(int i=0;i<sb.length();i++)
		{
			if(sb.charAt(i)==ch) {
				if(ch>='a'&&ch<='z'){
				sb.deleteCharAt(i);
				count++;
			}}
		}
		for(int i=0;i<count;i++) {
			sb.append(ch);
		}
		System.out.println(sb);
	}

}
