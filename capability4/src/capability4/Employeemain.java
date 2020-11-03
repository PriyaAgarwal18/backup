package capability4;
import java.util.Scanner;

public class Employeemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number of employess");
		int number=scan.nextInt();
		scan.nextLine();
		 
		Employee []employees= new Employee[number];
		for(int i=0;i<number;i++) {
			System.out.println("enter employee id");
			int id=scan.nextInt();
			scan.nextLine();
			System.out.println("enter employee name");
			String name=scan.nextLine();
			System.out.println("enter employee designation");
			String designation=scan.nextLine();
			System.out.println("enter employee department");
			String department=scan.nextLine();
			Employee emp= new Employee(id,name,designation,department);
			
			emp.setid(id);
			emp.setname(name);
			emp.setdesignation(designation);
			emp.setdepartment(department);
			employees[i]=emp;
		}
		for(int i=0;i<number;i++) {
			System.out.println(employees[i].getid());
			
			if(employees[i].getname().equals(" ")) {
				System.out.println("invalid input");
			}
			else {
				System.out.println(employees[i].getname());
			}
			if(employees[i].getdesignation().equals("developer")||employees[i].getdesignation().equals("tester")||employees[i].getdesignation().equals("lead")||employees[i].getdesignation().equals("manager")) {
				System.out.println(employees[i].getdesignation());
			}
			else {
				System.out.println("invalid input");
			}
			if(employees[i].getdepartment().equals("TTH")||employees[i].getdepartment().equals("RCM")||employees[i].getdepartment().equals("digital")||employees[i].getdepartment().equals("devops")) {
				System.out.println(employees[i].getdepartment());
			}
			else {
				System.out.println("invalid input");
			}
		
			
		}
		
		/*for(int i=0;i<number;i++) {
			System.out.println("employee details of "+(i+1));
			System.out.println("id "+employees[i].id);
			System.out.println("name "+employees[i].name);
			System.out.println("designation "+employees[i].designation);
			System.out.println("department "+employees[i].department);
		}*/

	}

}
