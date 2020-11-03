package capability2;
import java.util.Scanner;

public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter number of student");
		int number=s.nextInt();
		int array[]=new int[number];
		for(int i=0;i<number;i++) {
			//System.out.println("marks of "+i+"student");
			array[i]=s.nextInt();
		}
		int count=0;
//		for(int i=0;i<number;i++) {
	//		if(array[i]>=0&&array[i]<=25) {
		//		count++;
			//}
//		}System.out.println("the number of student scored marks between 0-25"+count);
		
		for(int i=0;i<=25;i++) {
			int count1=0;
			for(int j=0;j<number;j++) {
				if(array[j]==i) {
					count1++;
					
				}
			}System.out.println(i+"marks scored by" +count1);
		}

	}

}
