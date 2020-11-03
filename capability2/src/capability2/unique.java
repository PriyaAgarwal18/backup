package capability2;
import java.util.Scanner;
public class unique {
	public static void uniqelements(int a[],int b[],int m,int n){
	int flag=0;
	
	int i;
	int j;
	for( i=0;i<m;i++) {
		int count=0;
		for( j=0;j<n;j++) {
			if(a[i]==b[j]) {
				count++;}}
				if(count==0) {
					System.out.println(a[i]);
//					System.out.println(b[j]);
				}
			}
	for( j=0;j<n;j++) {
		int count=0;
		for( i=0;i<m;i++) {
			
			if(b[j]==a[i]) {
				count++;}}
				if(count==0) {
					System.out.println(b[j]);
				}
			}
	
	
			
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int flag=1;
		System.out.println("enter the number of values in first array");
		int m=s.nextInt();
		System.out.println("enter the number of values in second array");
		int n=s.nextInt();
		System.out.println("enter the values in first array");
		int a[]=new int[m];
		for(int i=0;i<m;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("enter the values in second array");
		int b[]=new int[n];
		for(int i=0;i<n;i++) {
			b[i]=s.nextInt();
		}		
		uniqelements(a,b,m,n);
		s.close();
		
		}
		
		
	

}
