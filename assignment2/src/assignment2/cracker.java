package assignment2;
import java.util.Scanner;

public class cracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the name of cracker fang says");
		while(true)
		{
			String name=s.nextLine();
		if(name.length()<=20) {
		System.out.println("Hagrid must choose the cracker with name"+'"' +name+'"');
		}
		else {
			System.out.println("enter the name of cracker of length less than 20");
			continue;
		}
		}
	}

}
