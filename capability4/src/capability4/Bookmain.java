package capability4;
import java.util.Scanner;
public class Bookmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("enter number of books");
int number=scan.nextInt();
scan.nextLine();
 
Book []books= new Book[number];
for(int i=0;i<number;i++) {
	System.out.println("enter book title");
	String title=scan.nextLine();
	System.out.println("enter author name");
	String author=scan.nextLine();
	System.out.println("enter price");
	int price=scan.nextInt();
//	scan.nextLine();
	System.out.println("enter year of publication");
	int year=scan.nextInt();
	scan.nextLine();
	Book bookss=new Book();
	bookss.setTitle(title);
	bookss.setAuthor(author);
	bookss.setPrice(price);
	bookss.setYear(year);	
	books[i]=bookss;
	
}for(int i=0;i<number;i++) {
	System.out.println(books[i].getTitle()+","+books[i].getAuthor()+","+books[i].getPrice()+","+books[i].getYear());
}

	}
}
