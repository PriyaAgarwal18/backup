package capability3;
import java.util.Scanner;

public class program5 {
	public static void bubblesort(int a[],int n) {
		
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
	}
	public static void insertionsort(int b[],int m) {
		for(int i=1;i<m;i++) {
			int key =b[i];
			int j=i-1;
			while(j>=0 && b[j]>key) {
				b[j+1]=b[j];
				 j=j-1;
				}b[j+1]=key;
		}
		for(int i=0;i<m;i++) {
		System.out.println(b[i]);
		}
	}
	public static void searchstring()
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter your choice \n 1.sort usine bubble sort \n 2.sort using insertion sort \n 2.search a string \n 4.exit");
		int value =s.nextInt();
		switch(value) {
		case 1 :System.out.println("enter the number to be sorted ");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter the array to be sorted ");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
			bubblesort(a,n);
		        break;
		case 2 :System.out.println("enter the number to be sorted ");
		int m=s.nextInt();
		int b[]=new int[m];
		System.out.println("enter the array to be sorted ");
		for(int i=0;i<m;i++) {
			b[i]=s.nextInt();
		}
			insertionsort(b,m);
		         break;
		case 3 :searchstring();
		        break;
		case 4: System.exit(0); 
		          break;
		}

	}

}
