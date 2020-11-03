package capabilitys4;
import java.util.Scanner;

public class Employeemain {
	 public static Employee[] adddetails( Scanner scan,int number) {
     	Employee[] employeess=new Employee[number];
     	for(int i=0;i<number;i++) {
 		System.out.println("enter employee id");
 	    int id=scan.nextInt();
 	    System.out.println("enter employee name");
 	    String name=scan.nextLine();
 	    System.out.println("enter employee department");
 	    String department=scan.nextLine();
 	    System.out.println("enter employee salary");
 	    long salary=scan.nextLong();
 	    Employee employees=new Employee(id,name,department,salary);
 	    employees.setId(id);
 	    employees.setName(name);
 	    employees.setDepartment(department);
 	    employees.setSalary(salary);
 	    employeess[i]= employees;
     	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);

        
        scan.nextLine();
        int number,i=0;
        System.out.println("enter number of employee");
        number=scan.nextInt();
        System.out.println("enter your choice\n 1. Add Employee Details \n2. Display Employee Names in sorted order based on branch (alphabetical order)\n 3. Display Employee ID in ascending  order\n  4. Display Employee details who has salary > 50000 ");
        int choice=scan.nextInt();
        switch(choice) {
		
        case 1:
        
        	 adddetails(scan,number);
        	     break;
        case 2: 
        	break;
        case 3:break;
        case 4:break;
        }
       
    	}
        
	}

}
