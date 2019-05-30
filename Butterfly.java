import java.util.Scanner;

public class Butterfly extends Critter{
	public static void main(String args[]) {
		Butterfly bf=new Butterfly();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		bf.Behaviour(n);
		
	}
}
