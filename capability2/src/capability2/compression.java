package capability2;

import java.util.Scanner;
import java.util.Scanner;

public class compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner s= new Scanner(System.in);
           System.out.println(" enter string");
           String str=s.nextLine();
           
          for(int i=0;i<str.length();i++) {
        	  int count=0;
        	  char ch=str.charAt(i);
        	  for(int j=i;j<str.length();j++) {
        		  if(str.charAt(i)==str.charAt(j)) {
        			  count++;
        		  }
        		  else {
        			  break;
        		  } 
        	  }System.out.print(ch+"" +count);
        	  i=i+count-1;
        	 
          }
         
          
	}
 
}
