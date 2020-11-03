package capability1;
import java.util.*;
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		int factorial =1;
		int i=1;
		while(i<=n) {
			factorial=factorial*i;
			i++;
		}
		System.out.println("factorial of number is"+factorial);
		
		
		}
		

	}


