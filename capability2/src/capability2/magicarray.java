package capability2;
import java.util.Scanner;
public class magicarray {
	public static boolean ismagic(int[][]a,int m,int n) {
		int sum1[]=new int[m];
		for(int i=0;i<m;i++) {
			sum1[i]=0;
			for(int j=0;j<n;j++) {
				sum1[i]+=a[i][j];
			}
					
				}
		int count1=1;
		for(int k=0;k<m-1;k++) {
			if(sum1[k]==sum1[k+1]) {
				count1++;
			}}
		if(count1==m) {
			return true;
		}
		else
		{
			return false;
		}}
		public static boolean column(int[][]a,int m,int n) {
		//column sum
		int sum2[]=new int[n];
		for(int i=0;i<n;i++) {
			sum2[i]=0;
			for(int j=0;j<m;j++) {
				sum2[i]+=a[i][j];
			}
					
				}
		int count2=1;
		for(int k=0;k<n-1;k++) {
			if(sum2[k]==sum2[k+1]) {
				count2++;
			}}
		if(count2==n) {
			return true;
		}
		else
			return false;
		}
		// diagonal sum
		public static boolean diagonal(int a[][],int m ,int n) {
		int sum3[]=new int[m];
		for(int k=0;k<m;k++) {
			sum3[k]+=a[k][k];
		}
		int count3=1;
		for(int i=0;i<m-1;i++) {
			if(sum3[i]==sum3[i+1]) {
				count3++;
			}
		}
		if(count3==m) {
			return true;
		}
		else
			return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter number of rows");
		int m= s.nextInt();
		System.out.println("enter number of columns");
		int n= s.nextInt();
		int b[]= new int[n];
		int a[][]= new int[m][n];
		int count=0;
		int sum=0;
		int sum1=0;
		int sum2=0;
		
		System.out.println("enter values");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=s.nextInt();
				}
		}
		boolean res=ismagic(a,m,n);
		boolean res1=column(a,m,n);
		boolean res2=diagonal(a,m,n);
		if(res==true && res1==true && res2==true) {
			System.out.println("it's a magic array");
		}
		else
			System.out.println("it's not a magic array");
		
		
	}

}
