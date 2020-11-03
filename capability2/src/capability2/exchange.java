package capability2;
import java.util.*;
import java.util.Scanner;

public class exchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Scanner s= new Scanner(System.in);
             
             
             System.out.println(" enter first name");
             String first=s.nextLine();
             System.out.println(" enter second name");
             String second=s.nextLine();
            int n= first.lastIndexOf(" ");
            int m= second.lastIndexOf(" ");
            String output= first.substring(0,n);
            String output2= second.substring(0,m);
            int p=first.length();
            int q=second.length();
            System.out.println(output+second.substring(m,q));
            System.out.println(output2+first.substring(n,p));
             }
             
             
             
             
             
            
             
           
		 
            	 
             }
         		
         		
         		
         		
         		
         		
	


