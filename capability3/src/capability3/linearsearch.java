package capability3;
import java.util.Scanner;

public class linearsearch {
	public static boolean search(int a[],int number,int key) {
		int flag=0;
	
		for(int i=0;i<number;i++) {
			if(a[i]==key) {
		flag=1;
		
	}}
			if(flag==1) {
				return true;
			}
			else 
			{
				return false;
			}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of elements ");
		int number=s.nextInt();
		int a[]=new int[number];
		System.out.println("enter the elements of array");
		for(int i=0;i<number;i++) {
			a[i]=s.nextInt();
			}
		System.out.println("enter the key to be searched");
		int key=s.nextInt();
		
				System.out.println(search(a,number,key));
			}
		

	}


