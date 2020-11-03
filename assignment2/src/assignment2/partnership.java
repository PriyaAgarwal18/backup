package assignment2;
import java.util.Arrays;
import java.util.Scanner;

public class partnership {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number of partnership you want to enter");
		int number =Integer.parseInt(s.nextLine());
		if(number>0) {
		System.out.println("enter the name of partnership with their scores");
		String [][]a=new String[number][3];
		for(int i=0;i<number;i++) {
			for(int j=0;j<3;j++) {
			a[i][j]=s.nextLine();
		}}
		System.out.println(Arrays.deepToString(a));
	}
		else
			System.out.println("invalid input");
			}

}
