package capability2;
import java.util.*;
import java.util.Scanner;

public class sumarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter number of elements in a array");
		int n =s.nextInt();
		int sum=0;
		System.out.println("enter all the elements of array");
		
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] =s.nextInt();
			
		}
		for(int i=0;i<n;i++) {
		sum=sum+a[i];}
        System.out.println("the sum of all elements in an array is "+ sum);
	}

}
