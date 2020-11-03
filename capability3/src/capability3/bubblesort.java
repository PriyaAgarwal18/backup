package capability3;
import java.util.Scanner;

public class bubblesort {

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
		int temp=0;
		for(int i=0;i<n-1;i++) {
			for(int j=1;j<n-i-1;j++) {
				if(a[j]>a[j+1])
				{
					
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		System.out.println("the array after sort ");
		for(int i=0;i<n;i++) {
		
		System.out.println(a[i]);
		}
	}

}
