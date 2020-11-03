package capability3;
import java.util.Scanner;

public class insertionsort {
	public static void insertion(int a[],int n) {
		for(int i=1;i<n;i++) {
			int key =a[i];
			int j=i-1;
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				 j=j-1;
				}a[j+1]=key;
		}
		for(int i=0;i<n;i++) {
		System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number to be sorted ");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter the array to be sorted ");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		insertion(a,n);

	}

}
