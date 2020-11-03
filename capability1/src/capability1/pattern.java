package capability1;
import java.util.*;
import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n= s.nextInt();System.out.println(" enter number of rows");
		for(int i=1;i<=n;i++) {
			for(int k=n;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}

	}

}
