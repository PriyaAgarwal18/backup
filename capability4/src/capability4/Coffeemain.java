package capability4;
import java.util.Scanner;

public class Coffeemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the number of customers want to give feedback");
		int number= scan.nextInt();
		scan.nextLine();
		Coffee[] coffees= new Coffee[number];
		for(int i=0;i<number;i++) {
			System.out.println("enter customers name");
			String name=scan.nextLine();
			System.out.println("enter mobile number");
			String mobile=scan.nextLine();
			
			System.out.println("enter feedback rating");
			double rating=scan.nextDouble();
			while(true) {
			if(rating>5) {
				System.exit(0);
			}
			else {
				break;
			}
			}
			scan.nextLine();
			
		
		Coffee coffeess= new Coffee(name,mobile,rating);
		coffeess.setName(name);
		coffeess.setMobile(mobile);
		coffeess.setRating(rating);
		coffees[i]=coffeess;
		}
		double sum=0;
		for(int j=0;j<number;j++) {
			sum=sum+coffees[j].getRating();
		}
		double avg=sum/number;
		System.out.println(avg);
		Coffee max=coffees[0];
		Coffee min=coffees[0];
		for(int k=0;k<number-1;k++) {
			if(max.getRating()<coffees[k+1].getRating()) {
				max=coffees[k+1];
			}
		}
		for(int k=0;k<number-1;k++) {
			if(min.getRating()>coffees[k+1].getRating()) {
				min=coffees[k+1];
			}
		}	
		System.out.println("the average rating is"+avg);
		System.out.println("the maximum rating  is"+max.getName()+max.getRating());
		System.out.println("the minimum rating  is"+min.getName()+min.getRating());
		}

}
