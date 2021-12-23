package 공부용;
import java.util.Scanner;
public class 연산자자가진단7 {

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	boolean c = (a!=0);
	boolean d = (b!=0);
	System.out.println((c&d)+" "+ (c|d));
	
		

	}

}
