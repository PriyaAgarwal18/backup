package assignment2;
import java.util.Arrays;
import java.util.Scanner;

public class bowlinout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of balls in the balls out");
		int number =s.nextInt();
		if(number>0) {
			int array[]=new int[number];
			for(int i=0;i<number;i++) {
				array[i]=s.nextInt();
				if((array[i]!=0)&&(array[i]!=1)) {
					System.out.println("invalid input");
					System.exit(0);
				}
			}
			int array2[]=Arrays.copyOf(array, number);
			
			for(int i=0;i<number;i++) {
				System.out.println(array2[i]);
		}}
		else {
			System.out.println("invalid input");
			System.exit(0);
		}

	}

}
