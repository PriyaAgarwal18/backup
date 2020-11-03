package capability2;

import java.util.Scanner;

public class rowmagic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
		int count=0;
		int flag=0;
		int sum=0;
		
		
		System.out.println("enter the number of rows matrix");
		int m=s.nextInt();
		System.out.println("enter the number of coulmns matrix");
		int n=s.nextInt();
		int b[]=new int[m*n];
		int a[][]= new int[m][n];		
		System.out.print("enter matrix data");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				 a[i][j]=s.nextInt();
			}
			
		}
		
		/*	for(int j=0;j<n;j++) {
				count+= a[0][j];
				
			}
			
		for(int i=1;i<m;i++) {
			for(int j=0;j<n;j++) {
				sum+= a[1][j];
				
			}
			if(count==sum) {
				flag=0;
			}
			else flag=1;}
			if(flag==0) {
				System.out.println("it's row magic");}
				else {
					System.out.println("it's not a row magic");*/
		int sum1[]=new int[n];
		for(int i=0;i<n;i++) {
			sum1[i]=0;
			for(int j=0;j<m;j++) {
				sum1[i]+=a[i][j];
			}
					
				}
		int count1=1;
		for(int k=0;k<n-1;k++) {
			if(sum1[k]==sum1[k+1]) {
				count1++;
			}}
			if(count1==m) {
				System.out.println("it's row magic");
			}
			else
			{
				System.out.println("it's not row magic");
			}
		
			
		}
		

	}


