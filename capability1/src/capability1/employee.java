package capability1;
import java.util.*;
import java.util.Scanner;
class validate{
	void input(String jobband, int department_code) {
		if( department_code>=110 &&department_code<=125)
		{
		if(jobband.equals("c1") ||jobband.equals("c2") || jobband.equals("c3") ||jobband.equals("c4") ) {
			
			System.out.println("employee job band and department code is" +jobband +department_code);
		}
			
		
	}
		else
		{
			System.out.println("invalid");
		}
}

	
}
public class employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		validate obj = new validate();
		Scanner s = new Scanner(System.in);
		System.out.println("enter epmloyment id, job band and department code");
		String employmentid =s.nextLine();
		String jobband =s.nextLine();
		int department_code = s.nextInt();
		String c1, c2, c3,c4;
		obj.input(jobband,department_code);
		
		 
			
		{
				
			System.out.println("employment id"+employmentid);
			
			
		}
		
	}
			
		

	}


