package capability3;
import java.util.Scanner;

public class maxelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of elements");
		int number =s.nextInt();
		int array[]=new int[number];
		int max=0;
		System.out.println("enter the elements of array");
		for(int i=0;i<number;i++) {
			array[i]=s.nextInt();
			}
		System.out.println("enter the value of index1");
		     int index1=s.nextInt();
		     System.out.println("enter the value of index2");
		     int index2=s.nextInt();
		     if((index1>=0)&&(index2<=number)) {
		    	 for(int i=index1;i<=index2-1;i++) {
		    		 if(array[i]>array[i+1]) {
		    			 max= array[i];
		    		 }
		    	 }System.out.println(max);
		    	 
		    	 
		     }
		     else {
		    	 System.out.println("error"); 
		    	 System.exit(0);
		     }
	}

}
