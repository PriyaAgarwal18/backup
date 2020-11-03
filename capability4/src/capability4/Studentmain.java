package capability4;
import java.util.Scanner;

public class Studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of student");
		int number=scan.nextInt();
		scan.nextLine();
		Student students[]=new Student[number];
		for(int i=0;i<number;i++) {
			System.out.println("enter student id");
			int studentid=scan.nextInt();
			scan.nextLine();
			System.out.println(" ");
		}

	}

}
