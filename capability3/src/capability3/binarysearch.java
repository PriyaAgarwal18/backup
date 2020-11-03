package capability3;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;

public class binarysearch {
	public static int[] bubblesort(int a[],int number) {
		int temp = 0;
		for (int i = 0; i < number - 1; i++) {
			for (int j = i+1; j < number - i - 1; j++) {
				if (a[j] > a[j + 1]) {

					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}

		}return a;
	}
	public static String[] stringsort(String b[],int n) {
		int c;
		String temp="";
		
		for (int i = 0; i < n - 1; i++) {
			for(int j=0;j<n-i-1;j++) {
			if(b[j].compareTo(b[j + 1])>0){
			
				temp = b[j];
				b[j] = b[j + 1];
				b[j + 1] = temp;
			}
			}
		}return b;
	}
	public static boolean findelement(int res2[], int low, int high,int key) {
		int mid = (low + high) / 2;
		int i=0,c=0;
		
		while (low <= high) {
			
			if (key == res2[mid]) {
				c++;
				break;

			} else if (res2[mid] < key) {
				low = mid + 1;
			} else {
				low = mid - 1;

			}mid=(low+high)/2;
		}
		if (c>0) {
			return true;
		} else
			return false;
	}

	public static boolean findstring(String str[], int low,int high,String key) {
		
             int mid = (low + high) / 2;
		int d=0;
		while (low <= high) {
			int res = key.compareToIgnoreCase(str[mid]);

			if (res == 0) {
				d++;
                break;
			} else if (res > 0) {
				low = mid + 1;
			} else {
				high = mid + 1;
				mid = low + high / 2;
			}
			
		}
		if (d> 0) {
			return true;
		} else
			return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter your choice \n 1.Binary Search for integer \n 2.Binary Search for String \n 3.exit ");
		int value = Integer.parseInt(s.nextLine());
		switch (value) {
		case 1:
			System.out.println("enter the number of elements ");
			int number = s.nextInt();
			int a[] = new int[number];
			System.out.println("enter the elements of array");
			for (int i = 0; i < number; i++) {
				a[i] = s.nextInt();
			}
			System.out.println("enter the key to be searched");
			int key = s.nextInt();
			int res2[]=new int[number];
			 res2=bubblesort(a,number);
			boolean res3=findelement(res2,0,number-1,key);
			if(res3==true) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
				
			}break;
			

			
			
		case 2:
			System.out.println("enter the number of string ");
			int n = Integer.parseInt(s.nextLine());

			String[] b = new String[n];
			System.out.println("enter the string ");
			for (int i = 0; i < n; i++) {
				b[i] = s.nextLine();
			}
			System.out.println("enter the key to be searched ");
			String name = s.nextLine();
			String str[]=new String[n];
			str=stringsort(b,n);
			boolean res = findstring(str,0,n-1,name);
			if(res==true) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
				
			}break;
		
		case 3:
			System.exit(0);
			break;
		}
	}

}
