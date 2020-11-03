package self;
import java.util.Scanner;

public class binary {
	public static void binarysearch(int a[],Scanner scan) {
		System.out.println("enter the key");
		int key=scan.nextInt();
		int mid,c=0;
		int low=0;
		int high=a.length-1;
		while(low<=high) {
			mid=low+high/2;
			if(key==a[mid]) {
				 c=mid;
				break;
		
			}
			else if(key<a[mid]) {
				high=mid-1;
			}
			else  {
					low=mid+1;
				
			}
		}System.out.println(c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("enter number of elements");
		int number=scan.nextInt();
		System.out.println("enter elements");
		int a[]=new int[number];
		for(int i=0;i<number;i++) {
			a[i]=scan.nextInt();
		}
		binarysearch(a,scan);

	}

}
