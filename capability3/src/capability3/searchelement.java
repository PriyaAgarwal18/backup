package capability3;
import java.util.Scanner;

public class searchelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number of elements");
		int number =s.nextInt();
		System.out.println("enter the elements");
		int array[]=new int[number];
		for(int i=0;i<number;i++) {
			array[i]=s.nextInt();
		}
		System.out.println("enter the key to be searched");
		int key=s.nextInt();
		for(int i=0;i<number-1;i++) {
			if(array[i]==array[i+1]) {
				System.out.println("error");
				System.exit(0);
			}
		}
		int k=0;
		
		for(int i=0;i<number;i++) {
		
			if(key==array[i]){
				k=i;
		   
			}
		}
		if(key==array[k]) {
			System.out.println(k);
		}
		else {
				System.out.println("element not found");
				System.exit(0);
			
		}

	}

}
