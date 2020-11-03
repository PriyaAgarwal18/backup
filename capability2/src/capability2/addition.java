package capability2;
import java.util.*;
import java.util.Scanner;

public class addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("enter the number of rows and colums matrix");
		int n=s.nextInt();
		
		int a[][]= new int[n][n];
		int b[][]= new int[n][n];
		int x[][]= new int[n][n];
		System.out.print("enter first matrix data");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				 a[i][j]=s.nextInt();
			}
			
		}
		
		System.out.println("enter second matrix data");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				 b[i][j]=s.nextInt();
			}
			
		}
		
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
		            x[i][j]=a[i][j]+b[i][j];
						
					}
	}


		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print('\t');
				System.out.print(x[i][j]);
	}
			
			}
	}
}
