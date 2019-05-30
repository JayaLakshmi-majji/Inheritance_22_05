import java.util.Scanner;

abstract class MyBook {
	String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
public class Book extends MyBook{
	void setTitle(String s){
		title=s;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s1=sc.nextLine();
		Book b=new Book();
		b.setTitle(s1);
		System.out.println("tittle="+b.getTitle());
	}
}
