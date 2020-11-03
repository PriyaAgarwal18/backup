package capability2;
import java.util.Scanner;

public class leaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of array");
		int number=s.nextInt();
		int array[]=new int[number];
		System.out.println("enter the array element");
		for(int i=0;i<number;i++) {
			array[i]=s.nextInt();
		}
//		int count=1;
		int j,i;
		for( j=0;j<number;j++) {
			for(i=j+1;i<number;i++) {
			if(array[j]<=array[i]) {
				break;
			}
			}
		if(i==number) {
				System.out.println(array[j]+" ");
			}		
	}
	}
}
