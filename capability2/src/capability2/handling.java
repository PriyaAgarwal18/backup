package capability2;
import java.util.Scanner;
import java.util.Scanner;

public class handling {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter number of elements in a first array");
		int m = s.nextInt();
		System.out.println("enter number of elements in a second array");
		int n = s.nextInt();
		System.out.println("enter elements in a first array");
		double a[] = new double[m];
		for (int i = 0; i < m; i++) {
			a[i] = s.nextDouble();
		}

		System.out.println("enter elements in a second array");
		double b[] = new double[n];
		for (int j = 0; j < n; j++) {
			b[j] = s.nextDouble();
		}
		
		 if(m>n||m==n) {
			
			for(int i=0;i<n;i++) {
				a[i]=a[i]+b[i];
			}
			for(int i=0;i<m;i++) {
				int sum[]=new int[m];
				 sum[i]=(int) a[i];
				System.out.print((sum[i]+" "));
			}
		}
		else {
			double sum[]=new double[m];
			for(int i=0;i<m;i++) {
				b[i]=b[i]+a[i];
			}
			for(int i=0;i<n;i++) {
				int sum1[]=new int[n];
				sum1[i]=(int) b[i];
				System.out.print(sum1[i]+" ");
			}
		}
	
		
		
    }
		
		

	}


